package dao;

import dto.QuestionDto;
import dto.UserInfoDto;
import login.LoginFrame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static util.DbConn.getConn;

public class UserInfoDao {

    public boolean login(String id, String pw) {

        Connection conn = getConn();

        String sql = "SELECT * FROM userinfo1 where id=? and pw=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,pw);
            ResultSet rs = ps.executeQuery();

            boolean result = rs.next();
            if(result) {
                LoginFrame.userId = rs.getString("id");
            }

            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<QuestionDto> getQuestionList() {

        Connection conn = getConn();

        try {
            String sql = "SELECT * FROM question where category=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "0");
            ResultSet rs = ps.executeQuery();

            // 変換 ResultSet -> List<UserInfodto>
            List<QuestionDto> questionDtoList = new ArrayList<QuestionDto>();

            while(rs.next()) {
                QuestionDto questionDto = new QuestionDto();
                questionDto.setNo(rs.getInt("no"));
                questionDto.setContent(rs.getString("content"));
                questionDto.setSelection(rs.getString("selection"));
                questionDto.setCategory(rs.getString("category"));

                questionDtoList.add(questionDto);
            }

            return questionDtoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
