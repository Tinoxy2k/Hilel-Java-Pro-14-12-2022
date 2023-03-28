package Repository;

import Exceptions.SqlUpdateException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleTone {
    private static Connection connection;
    private static final String name = "postgres";
    private static final String password = "admin";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection getConnection() {

        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, name, password);
            }
        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
        return connection;
    }
}
