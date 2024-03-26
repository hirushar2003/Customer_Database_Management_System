package lk.ijse.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.db.controller.JDBCController;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
        new JDBCController();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.setTitle("Login Form");
        stage.show();
    }
}
