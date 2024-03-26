package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainpageController {
    public AnchorPane mainFormAp;
    public AnchorPane dashboardAp;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent customerPhane = FXMLLoader.load(getClass().getResource("/view/ap_customer.fxml"));

        dashboardAp.getChildren().clear();
        dashboardAp.getChildren().add(customerPhane);
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Parent itemPhane = FXMLLoader.load(getClass().getResource("/view/ap_item.fxml"));

        dashboardAp.getChildren().clear();
        dashboardAp.getChildren().add(itemPhane);
    }
    public void btnDashboardOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootMainPage = FXMLLoader.load(getClass().getResource("/view/main_page.fxml"));

        Scene scene = new Scene(rootMainPage);
        Stage stage = (Stage) mainFormAp.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Main Window");
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) mainFormAp.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Login Window");
    }
}
