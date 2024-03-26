package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.db.controller.Credential;

import java.io.IOException;
import java.sql.*;

public class LoginFormController {

    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane loginAp;
    public void btnLoginOnAction() throws SQLException, IOException {

        String sql = "SELECT * FROM user" ;

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kade",
                "root",
                "1234");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            String un = resultSet.getString("userName");
            String p = resultSet.getString("password");

            if (un.equals(txtUserName.getText()) && p.equals(txtPassword.getText())){
                Parent rootNode = FXMLLoader.load(getClass().getResource("/view/main_page.fxml"));
                Scene scene = new Scene(rootNode);
                Stage stage = (Stage) loginAp.getScene().getWindow();
                stage.setScene(scene);
            } else {
                new Alert(Alert.AlertType.ERROR,"Invalid User Name or Password").show();
            }
            txtUserName.clear();
            txtPassword.clear();
        }
    }

    public void registerBtnOnAction(MouseEvent mouseEvent) throws IOException {
        Parent rootNodeReg = FXMLLoader.load(getClass().getResource("/view/register_form.fxml"));
        Scene scene = new Scene(rootNodeReg);
        Stage stage = (Stage) loginAp.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Register page");
    }
}
