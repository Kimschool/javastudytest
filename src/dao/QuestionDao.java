package dao;

import dto.QuestionDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static util.DbConn.getConn;

public class QuestionDao {

    Connection conn = getConn();

    public List<QuestionDto> getQuestionList(int category) {

        try {
            String sql = "SELECT * FROM question where category=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, category);
            ResultSet rs = ps.executeQuery();

            // 変換 ResultSet -> List<UserInfodto>
            List<QuestionDto> questionDtoList = new ArrayList<QuestionDto>();

            while(rs.next()) {
                QuestionDto questionDto = new QuestionDto();
                questionDto.setNo(rs.getInt("no"));
                questionDto.setContent(rs.getString("content"));
                questionDto.setSelection(rs.getString("selection"));
                questionDto.setCategory(rs.getInt("category"));
                questionDto.setAnswer(rs.getInt("answer"));
                questionDto.setParticipantCount(rs.getInt("participant_count"));
                questionDto.setCorrectionCount(rs.getInt("correction_count"));

                questionDtoList.add(questionDto);
            }

            return questionDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateQuestion(int questionNo, boolean correct) {

        try {
            StringBuilder sql = new StringBuilder();

            sql.append("UPDATE question SET participant_count = participant_count + 1");
            if (correct) {
                sql.append(", correction_count = correction_count + 1");
            }
            sql.append(" where no = ?");

            PreparedStatement ps = conn.prepareStatement(String.valueOf(sql));
            ps.setInt(1, questionNo);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }
