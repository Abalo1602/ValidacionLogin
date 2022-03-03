package com.example.validacionlogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    String userLogin = "\\b([0-9]{1,2}|[1-6][0-9]{2}|7[0-3][0-9]|74[0-4])\\b";
    String passwordLogin = "\\b([0-9]{1,2}|[1-6][0-9]{2}|7[0-3][0-9]|74[0-4])\\b";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("vista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 480);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}