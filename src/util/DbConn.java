package util;

import login.LoginFrame;

import java.sql.*;

public class DbConn {

    public static Connection getConn() {

        String url = "jdbc:mysql://localhost:3306/weavus";
        String user = "root";
        String password = "";

        // MySQL 데이터베이스 연결
        Connection conn;

        try {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
