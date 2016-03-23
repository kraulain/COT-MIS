package cot.views;

import javafx.geometry.Rectangle2D;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class HomeController {

    HomeView stage;

    public HomeController(HomeView stage) {
        stage.initialize();
        stage.setScene(stage.scene);
        stage.setTitle("COT-MIS (version 16.03)");
        this.stage = stage;
        registerEventListeners();
        maximise();
        this.stage.show();
    }

    private void registerEventListeners() {
        stage.navbar.newStudent_lbl.setOnMouseClicked(event -> newStudentClicked());
        stage.navbar.findStudent_lbl.setOnMouseClicked(event -> findStudentClicked());
        stage.navbar.groups_lbl.setOnMouseClicked(event -> manageGroupClicked());
    }

    private void maximise() {
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        this.stage.setWidth(bounds.getWidth());
        this.stage.setHeight(bounds.getHeight());
    }

    private void newStudentClicked() {
        NewStudentTab newStudentTab = new NewStudentTab();
        newStudentTab.intialize();
        newStudentTab.setGraphic(new ImageView(new Image("cot/rsc/student_id_icon.png")));
        newStudentTab.setContent(newStudentTab.root_vBox);
        newStudentTab.setText("New Student");
        newStudentTab.setTooltip(new Tooltip("Create a new student"));
        stage.tabPane.getTabs().add(newStudentTab);
        stage.tabPane.getSelectionModel().select(newStudentTab);
    }

    private void findStudentClicked() {
        FindStudentTab findStudentTab = new FindStudentTab();
        findStudentTab.initialize();
        findStudentTab.setContent(findStudentTab.root_VBox);
        findStudentTab.setText("Find Student");
        findStudentTab.setTooltip(new Tooltip("Search for a student"));
        stage.tabPane.getTabs().add(findStudentTab);
        stage.tabPane.getSelectionModel().select(findStudentTab);
    }

    private void manageGroupClicked() {
        GroupTab groupTab = new GroupTab();
        groupTab.initialize();
        groupTab.setContent(groupTab.root_hBox);
        groupTab.setText("Groups");
        groupTab.setTooltip(new Tooltip("Manage Groups"));
        stage.tabPane.getTabs().add(groupTab);
        stage.tabPane.getSelectionModel().select(groupTab);
    }
}
