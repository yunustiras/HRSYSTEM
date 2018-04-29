package hrsystem.util;

import com.github.underscore.$;

import java.sql.*;

public class SQLiteJDBC {
    public static String driver = "org.sqlite.JDBC";
    public static String dbUrlFormat = "jdbc:sqlite";

    public static void isHaveDriver() throws Exception{
        Class.forName(driver);
    }

    // Create, Update, Insert, Delete
    public static void execute(String dbName, String query) throws Exception {
        String dbUrl = $.format("{}:{}", dbUrlFormat, dbName);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl);
            Statement st = conn.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Not connected");
        } finally {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
    }
}
