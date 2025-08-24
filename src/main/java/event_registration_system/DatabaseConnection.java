package event_registration_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/event_registration_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "zahiya2004";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the JDBC driver
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
