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
import lk.ijse.db.controller.User;
import lk.ijse.db.controller.UserJDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterFormController {

    public AnchorPane registerAp;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtEmail;
    public TextField txtUserNameReg;
    public TextField txtPasswordReg;

    public void btnRegisterOnAction(ActionEvent actionEvent) throws SQLException {
        String name = txtName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();
        String email = txtEmail.getText();
        String userName = txtUserNameReg.getText();
        String password = txtPasswordReg.getText();

        UserJDBC.saveUser(name, address, contact, email, userName, password);

        new Alert(Alert.AlertType.CONFIRMATION, "Successfully Registerd").show();

    }

    public void loginBtnNavigateOnAction(MouseEvent mouseEvent) throws IOException {
        Parent rootNodeReg = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNodeReg);
        Stage stage = (Stage) registerAp.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Login Page");
    }
}
