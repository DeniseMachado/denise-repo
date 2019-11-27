package org.academiadecodigo.bootcamp.persistence;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection connection = null;
    private String dbUrl = "jdbc:mysql://localhost/jdbc";
    private String user = "root";
    private String password = "";

    public Connection getConnection() {

        try {
            if(connection == null) {
                connection = DriverManager.getConnection(dbUrl,user,password);
                System.out.println(dbUrl + user + password);
            }
        } catch (SQLException ex) {
            System.out.println("Failure to connect to database: " + ex.getMessage());
        }

        return connection;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Failure to close database connection: " + ex.getMessage());
        }
    }
}
