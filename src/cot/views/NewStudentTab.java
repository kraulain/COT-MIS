package cot.views;

import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class NewStudentTab extends Tab{
    
    GridPane root_gridPane = new GridPane();
    
    Label matricule_lbl = new Label("Matricule Number:");
    TextField matricule_txt = new TextField();
    Label group_lbl = new Label("Group:");
    ChoiceBox group_box = new ChoiceBox();
    Label fname_lbl = new Label("First Name:");
    TextField fname_txt = new TextField();
    Label lname_lbl = new Label("Last Name:");
    TextField lname_txt = new TextField();
    Label department_lb = new Label("Department:");
    ChoiceBox department_box = new ChoiceBox();
    Label option_lbl = new Label("Option:");
    ChoiceBox option_box = new ChoiceBox();
    Label level_lbl = new Label("Level:");
    ChoiceBox level_box = new ChoiceBox();
    Label phone1_lbl = new Label("Phone Number:");
    TextField phone1_txt = new TextField();
    Label phone2_lbl = new Label("Phone Number:");
    TextField phone2_txt = new TextField();
    Label email_lbl = new Label("Email Address:");
    TextField email_txt = new TextField();
    Label pic_lbl = new Label("Picture:");
    TextField pic_txt = new TextField();
    Button browse_btn = new Button("Browse");
    HBox pic_Hbox = new HBox(pic_lbl,pic_txt,browse_btn);
    
    Label homeTown_lbl = new Label("Home Town:");
    TextField homeTown_txt = new TextField();
    Label parent1_lbl = new Label("Parent Contact:");
    TextField parent1_txt = new TextField();
    Label parent2_lbl = new Label("Parent Number:");
    TextField parent2_txt = new TextField();
    Label dob_lbl = new Label("Date Of Birth:");
    DatePicker dob_pick = new DatePicker();
    Label note_lbl = new Label("Note:");
    TextArea note_txt = new TextArea();
    
    Button save_btn = new Button("Save");
    
    ObservableList<String> departmentList = FXCollections.observableArrayList();
    ObservableList<String> levelList = FXCollections.observableArrayList();
    ObservableList<String> optionList = FXCollections.observableArrayList();

    
    public void intialize(){
        root_gridPane.add(matricule_lbl, 0, 0, 1, 1);
        root_gridPane.add(matricule_txt, 1, 0, 1, 1);
        root_gridPane.add(group_lbl, 2, 0, 1, 1);
        root_gridPane.add(group_box, 3, 0, 1, 1);
        root_gridPane.add(fname_lbl, 0, 1, 1, 1);
        root_gridPane.add(fname_txt, 1, 1, 1, 1);
        root_gridPane.add(lname_lbl, 2, 1, 1, 1);
        root_gridPane.add(lname_txt, 3, 1, 1, 1);
        root_gridPane.add(department_lb, 0, 2, 1, 1);
        root_gridPane.add(department_box, 1, 2, 1, 1);
        root_gridPane.add(option_lbl, 2, 2, 1, 1);
        root_gridPane.add(option_box, 3, 2, 1, 1);
        root_gridPane.add(level_lbl, 0, 3, 1, 1);
        root_gridPane.add(level_box, 1, 3, 1, 1);
        root_gridPane.add(phone1_lbl, 0, 4, 1, 1);
        root_gridPane.add(phone1_txt, 1, 4, 1, 1);
        root_gridPane.add(phone2_lbl, 2, 4, 1, 1);
        root_gridPane.add(phone2_txt, 3, 4, 1, 1);
        root_gridPane.add(email_lbl, 0, 5, 1, 1);
        root_gridPane.add(email_txt, 1, 5, 1, 1);
        root_gridPane.add(pic_lbl, 2, 5, 1, 1);
        root_gridPane.add(pic_Hbox, 3, 5, 1, 1);
        root_gridPane.add(homeTown_lbl, 0, 6, 1, 1);
        root_gridPane.add(homeTown_txt, 1, 6, 1, 1);
        root_gridPane.add(parent1_lbl, 0, 7, 1, 1);
        root_gridPane.add(parent1_txt, 1, 7, 1, 1);
        root_gridPane.add(parent2_lbl, 2, 7, 1, 1);
        root_gridPane.add(parent2_txt, 3, 7, 1, 1);
        root_gridPane.add(dob_lbl, 0, 8, 1, 1);
        root_gridPane.add(dob_pick, 1, 8, 1, 1);
        root_gridPane.add(note_lbl, 0, 9, 1, 1);
        root_gridPane.add(note_txt, 1, 9, 3, 1);
        root_gridPane.add(save_btn, 2, 10, 1, 1);
        
        root_gridPane.setAlignment(Pos.TOP_CENTER);
        root_gridPane.setVgap(10);
        root_gridPane.setHgap(20);
        root_gridPane.setPadding(new Insets(15));
        root_gridPane.setBackground(Background.EMPTY);
        
        initChoiceBoxes();
    }
    
    private void initChoiceBoxes(){
        departmentList.addAll("Computer Engineering", "Electrical Engineering", "HND");
        levelList.addAll("200","300","400");
        optionList.addAll("Software Engineering", "Computer Networks", "Electrical Engineering", "Telecomunication", "EPS", "ICT");
        department_box.getItems().addAll(departmentList);
        level_box.getItems().addAll(levelList);
        option_box.getItems().addAll(optionList);
    }
}
