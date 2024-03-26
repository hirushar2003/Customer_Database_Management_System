package lk.ijse.db.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCController {
    private static Connection connection ;
    private static Statement statement ;

    private static void loginAndRegisterDrive() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    private static void createTheConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop",
                "root",
                "1234");
    }
    private static void createTheStatement() throws SQLException {
        statement = connection.createStatement();
    }
    private static void executeTheQuery() throws SQLException {
        String sql = "INSERT INTO customer(id, name, address, tel) VALUES('C007', 'Kithmi', 'Jaffna', '0714567685')";

        int affectedRows = statement.executeUpdate(sql);
        System.out.println("affected rows: " + affectedRows);
    }
    private static void closeTheConnection() throws SQLException {
        connection.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        loginAndRegisterDrive();
        createTheConnection();
        createTheStatement();
        executeTheQuery();
        closeTheConnection();
    }
}
