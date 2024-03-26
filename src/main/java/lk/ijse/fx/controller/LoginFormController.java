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

public class LoginFormController {

    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane loginAp;

    /*public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String un = "User";
        String pa = "1111";

        if (un.equals(txtUserName.getText())&& pa.equals(txtPassword.getText())){
            Parent mainRoot = FXMLLoader.load(getClass().getResource("/view/main_page.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(mainRoot);
            stage.setScene(scene);
            stage.setTitle("Main Frame");
            stage.show();

        } else {
            System.out.println("no");
        }
    }*/
    public void btnLoginOnAction() throws IOException {
        String username = txtUserName.getText();
        String password = txtPassword.getText();

        if (username.equals(Credential.userName) && password.equals(Credential.password)){
            Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_page.fxml"));

            Scene scene = new Scene(rootNode);
            Stage stage = (Stage) this.loginAp.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Main page");
        } else {
            new Alert(Alert.AlertType.ERROR, "Login Failed").show();
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
