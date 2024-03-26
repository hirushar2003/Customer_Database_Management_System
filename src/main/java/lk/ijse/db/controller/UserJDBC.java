package lk.ijse.db.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserJDBC {
    public static void saveUser(String name, String address, String contact, String email, String userName, String password) throws SQLException {

        String sql = "INSERT INTO user VALUES(?, ?, ?, ?, ?, ?)" ;

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kade",
                "root",
                "1234"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, name);
        preparedStatement.setObject(2, address);
        preparedStatement.setObject(3, contact);
        preparedStatement.setObject(4, email);
        preparedStatement.setObject(5, userName);
        preparedStatement.setObject(6, password);

        int affectedRows = preparedStatement.executeUpdate();

        if(affectedRows > 0)
            System.out.println("user saved!");
        else
            System.out.println("user not saved!");
    }
}
