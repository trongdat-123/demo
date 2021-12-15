package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewLoginAdmin_Controller extends Application {

    @FXML
    private Button button;

    @FXML
    private void onClick() {
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene1 = null;
        try {
            scene1 = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage1.setTitle("Hello!");
        stage1.setScene(scene1);
        stage1.show();

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
