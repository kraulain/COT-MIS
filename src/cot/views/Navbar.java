package cot.views;

import cot.entities.User;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Navbar extends VBox {

    User user = new User();

    public Navbar(User user) {
        this.user = user;
    }

    VBox students_menu = new VBox();
    TitledPane students_pane = new TitledPane("Students", students_menu);

    Label newStudent_lbl = new Label("New Student");
    Label findStudent_lbl = new Label("Find Student");
    Label groups_lbl = new Label("Manage Groups");

    VBox notice_menu = new VBox();
    TitledPane notice_pane = new TitledPane("Notices", notice_menu);

    Label newNotice_lbl = new Label("New Notice");
    Label allNotices_lbl = new Label("View All Notices");

    VBox message_menu = new VBox();
    TitledPane message_pane = new TitledPane("Messages", message_menu);

    Label newMessage_lbl = new Label("New Message");
    Label allMessages_lbl = new Label("View All Messages");

    VBox admin_menu = new VBox();
    TitledPane admin_pane = new TitledPane("System Admin", admin_menu);

    Label manage_lbl = new Label("Manage Users");
    Label reports_lbl = new Label("Generate Reports");
    Label settings_lbl = new Label("System Settings");

    public void initialize() {

        newStudent_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        newStudent_lbl.setGraphic(new ImageView(new Image("cot/rsc/new_contact_icon.png")));
        findStudent_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        findStudent_lbl.setGraphic(new ImageView(new Image("cot/rsc/search_icon.png")));
        groups_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        groups_lbl.setGraphic(new ImageView(new Image("cot/rsc/group_icon.png")));
        students_menu.setStyle("-fx-background-color: darkgrey");

        newNotice_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        allNotices_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        notice_menu.setStyle("-fx-background-color: darkgrey");

        newMessage_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        newMessage_lbl.setGraphic(new ImageView(new Image("cot/rsc/mail_icon.png")));
        allMessages_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        message_menu.setStyle("-fx-background-color: darkgrey");

        manage_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        reports_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        settings_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));

        admin_menu.setStyle("-fx-background-color: pink");

        switch (user.getRole()) {
            case "DEAN":
                students_menu.getChildren().addAll(findStudent_lbl);
                notice_menu.getChildren().addAll(newNotice_lbl, allNotices_lbl);
                message_menu.getChildren().addAll(newMessage_lbl, allMessages_lbl);
                admin_menu.getChildren().addAll(manage_lbl, settings_lbl);
                break;
            case "VICE DEAN":
                students_menu.getChildren().addAll(findStudent_lbl);
                notice_menu.getChildren().addAll(newNotice_lbl, allNotices_lbl);
                message_menu.getChildren().addAll(newMessage_lbl, allMessages_lbl);
                admin_menu.getChildren().addAll(manage_lbl, settings_lbl);
                break;
            case "HOD":
                students_menu.getChildren().addAll(newStudent_lbl, findStudent_lbl);
                notice_menu.getChildren().addAll(newNotice_lbl, allNotices_lbl);
                message_menu.getChildren().addAll(newMessage_lbl, allMessages_lbl);
                admin_menu.getChildren().addAll(manage_lbl, settings_lbl);
                break;
            case "SECRETARY":
                students_menu.getChildren().addAll(newStudent_lbl, findStudent_lbl, groups_lbl);
                notice_menu.getChildren().addAll(newNotice_lbl, allNotices_lbl);
                message_menu.getChildren().addAll(newMessage_lbl, allMessages_lbl);
                admin_menu.getChildren().addAll(manage_lbl, settings_lbl);
                break;
            default:
                students_menu.getChildren().addAll(findStudent_lbl);
//                notice_menu.getChildren().addAll(newNotice_lbl, allNotices_lbl);
//                message_menu.getChildren().addAll(newMessage_lbl, allMessages_lbl);
                admin_menu.getChildren().addAll(manage_lbl, settings_lbl);
                break;
        }

        registerEventListeners();
    }

    private void registerEventListeners() {
        newStudent_lbl.setOnMouseEntered(event -> underline(newStudent_lbl));
        newStudent_lbl.setOnMouseExited(event -> revert(newStudent_lbl));

        findStudent_lbl.setOnMouseEntered(event -> underline(findStudent_lbl));
        findStudent_lbl.setOnMouseExited(event -> revert(findStudent_lbl));

        groups_lbl.setOnMouseEntered(event -> underline(groups_lbl));
        groups_lbl.setOnMouseExited(event -> revert(groups_lbl));

        newNotice_lbl.setOnMouseEntered(event -> underline(newNotice_lbl));
        newNotice_lbl.setOnMouseExited(event -> revert(newNotice_lbl));

        allNotices_lbl.setOnMouseEntered(event -> underline(allNotices_lbl));
        allNotices_lbl.setOnMouseExited(event -> revert(allNotices_lbl));

        newMessage_lbl.setOnMouseEntered(event -> underline(newMessage_lbl));
        newMessage_lbl.setOnMouseExited(event -> revert(newMessage_lbl));

        allMessages_lbl.setOnMouseEntered(event -> underline(allMessages_lbl));
        allMessages_lbl.setOnMouseExited(event -> revert(allMessages_lbl));

        manage_lbl.setOnMouseEntered(event -> underline(manage_lbl));
        manage_lbl.setOnMouseExited(event -> revert(manage_lbl));

        reports_lbl.setOnMouseEntered(event -> underline(reports_lbl));
        reports_lbl.setOnMouseExited(event -> revert(reports_lbl));

        settings_lbl.setOnMouseEntered(event -> underline(settings_lbl));
        settings_lbl.setOnMouseExited(event -> revert(settings_lbl));
    }

    private void underline(Label l) {
        l.setUnderline(true);
        l.setStyle("-fx-cursor: hand; -fx-text-fill: blue;");
    }

    private void revert(Label l) {
        l.setUnderline(false);
        l.setStyle("-fx-cursor: arrow; -fx-text-fill: black;");
    }
}
