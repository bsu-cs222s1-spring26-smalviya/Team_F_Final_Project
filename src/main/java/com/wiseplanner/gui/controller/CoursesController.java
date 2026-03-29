package com.wiseplanner.gui.controller;

import com.wiseplanner.core.WisePlannerKernel;
import com.wiseplanner.model.Course;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class CoursesController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<Course> coursesTable;

    @FXML
    private TableColumn<Course, String> idColumn;

    @FXML
    private TableColumn<Course, String> nameColumn;

    WisePlannerKernel wisePlannerKernel;

    public void setWisePlannerKernel(WisePlannerKernel wisePlannerKernel) {
        this.wisePlannerKernel = wisePlannerKernel;
    }

    public void setCoursesTable() {
        wisePlannerKernel.canvas().updateCourses();
        ObservableList<Course> courses = FXCollections.observableArrayList(wisePlannerKernel.canvas().getCourses());
        coursesTable.setItems(courses);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        coursesTable.getColumns().setAll(idColumn, nameColumn);
    }
}
