package com.wiseplanner.gui.controller;

import com.wiseplanner.core.WisePlannerKernel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public class MainWindowController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button coursesButton;

    @FXML
    private VBox navigationBar;

    @FXML
    private StackPane pagePane;

    @FXML
    private Button settingsButton;

    @FXML
    private Button tasksButton;

    @FXML
    private HBox topBar;

    @FXML
    void onCoursesButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getClassLoader().getResource("fxml/Courses.fxml")));
        Parent node = loader.load();
        CoursesController controller = loader.getController();
        controller.setWisePlannerKernel(wisePlannerKernel);
        controller.setCoursesTable();
        pagePane.getChildren().setAll(node);
    }

    @FXML
    void onSettingsButtonClick(ActionEvent event) {

    }

    @FXML
    void onTasksButtonClick(ActionEvent event) {

    }

    WisePlannerKernel wisePlannerKernel;

    public void setWisePlannerKernel(WisePlannerKernel wisePlannerKernel) {
        this.wisePlannerKernel = wisePlannerKernel;
        wisePlannerKernel.initialize();
    }

}
