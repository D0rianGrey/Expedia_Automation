package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DbConnection {
    INSTANCE;
    Connection connection;


    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Q852456357159q");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
