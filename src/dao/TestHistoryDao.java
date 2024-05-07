package dao;

import dto.QuestionDto;
import dto.TestHistoryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static util.DbConn.getConn;

public class TestHistoryDao {

    Connection conn = getConn();

    public TestHistoryDto getTestHistory(int no, String userId) {

        try {
            String sql = "SELECT * FROM test_history where question_no=? and user_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, no);
            ps.setString(2, userId);
            ResultSet rs = ps.executeQuery();

            TestHistoryDto testHistoryDto = new TestHistoryDto();

            while(rs.next()) {
                testHistoryDto.setNo(rs.getInt("no"));
                testHistoryDto.setUserId(rs.getString("user_id"));
                testHistoryDto.setSelection(rs.getInt("selection"));
                testHistoryDto.setQuestionNo(rs.getInt("question_no"));
                testHistoryDto.setCategory(rs.getInt("category"));
            }

            return testHistoryDto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveTestHistory(TestHistoryDto testHistoryDto) {
        try {
            String sql = "INSERT INTO test_history(category, user_id, selection, question_no) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, testHistoryDto.getCategory());
            ps.setString(2, testHistoryDto.getUserId());
            ps.setInt(3, testHistoryDto.getSelection());
            ps.setInt(4, testHistoryDto.getQuestionNo());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkExistHistory(String id, int category) {
        try {
            String sql = "select * from test_history where user_id = ? and category = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setInt(2, category);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
