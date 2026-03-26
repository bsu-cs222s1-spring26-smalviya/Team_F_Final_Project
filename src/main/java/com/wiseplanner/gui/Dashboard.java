package com.wiseplanner.gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Dashboard extends Application {

    public Dashboard(){

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Dashboard.fxml")));
        primaryStage.setTitle("Dashboard");
        primaryStage.setScene(new Scene(root, 1300, 1000));
        primaryStage.show();
    }

    @FXML
    private AnchorPane anchorPane;

}
