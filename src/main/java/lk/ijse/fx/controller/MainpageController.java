package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class MainpageController {
    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootCustomer = FXMLLoader.load(getClass().getResource("/view/ap_customer.fxml"));

    }

    public void btnItemOnAction(ActionEvent actionEvent) {

    }
}
