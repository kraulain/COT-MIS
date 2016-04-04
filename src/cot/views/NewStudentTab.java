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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class NewStudentTab extends Tab{
    
    VBox root_vBox = new VBox();
    
    GridPane student_id_info_gridPane = new GridPane(); // this GridPane contains controls to get information about the student's ID
    GridPane student_option_info_gridPane = new GridPane(); // this GridPane contains controls to get information about the student's option
    GridPane student_address_info_gridPane = new GridPane(); // this GridPane contains controls to get information about the student's address
    GridPane tail_gridPane = new GridPane(); // this GridPane contains the note textarea and the save button
    
    GroupBox student_id_info_groupBox = new GroupBox(); // this GroupBox groups the controls providing information about the student's ID
    GroupBox student_option_info_groupBox = new GroupBox(); // this GroupBox groups the controls providing information about the student's option
    GroupBox student_address_info_groupBox = new GroupBox(); // this GroupBox groups the controls providing information about the student's ID
    
    Label matricule_lbl = new Label("Matricule Number:");
    TextField matricule_txt = new TextField();
    Label group_lbl = new Label("Group:");
    ChoiceBox group_box = new ChoiceBox();
    Label fname_lbl = new Label("First Name:");
    TextField fname_txt = new TextField();
    Label lname_lbl = new Label("Last Name:");
    TextField lname_txt = new TextField();
    Label sex_lbl = new Label("Sex:");
    ChoiceBox sex_box = new ChoiceBox();
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
    ObservableList<String> sexList = FXCollections.observableArrayList();
    ObservableList<String> levelList = FXCollections.observableArrayList();
    ObservableList<String> optionList = FXCollections.observableArrayList();

    
    public void intialize(){
        student_id_info_gridPane.add(matricule_lbl, 0, 0, 1, 1);
        student_id_info_gridPane.add(matricule_txt, 1, 0, 1, 1);
        student_id_info_gridPane.add(group_lbl, 2, 0, 1, 1);
        student_id_info_gridPane.add(group_box, 3, 0, 1, 1);
        student_id_info_gridPane.add(fname_lbl, 0, 1, 1, 1);
        student_id_info_gridPane.add(fname_txt, 1, 1, 1, 1);
        student_id_info_gridPane.add(lname_lbl, 2, 1, 1, 1);
        student_id_info_gridPane.add(lname_txt, 3, 1, 1, 1);
        student_id_info_gridPane.add(sex_lbl, 0, 2, 1, 1);
        student_id_info_gridPane.add(sex_box, 1, 2, 1, 1);
        student_id_info_gridPane.add(dob_lbl, 2, 2, 1, 1);
        student_id_info_gridPane.add(dob_pick, 3, 2, 1, 1);
        
        student_id_info_gridPane.setAlignment(Pos.TOP_CENTER);
        student_id_info_gridPane.setVgap(10);
        student_id_info_gridPane.setHgap(20);
        student_id_info_gridPane.setPadding(new Insets(15));
        student_id_info_gridPane.setBackground(Background.EMPTY);
        student_id_info_groupBox.getChildren().add(student_id_info_gridPane);
        student_id_info_groupBox.setTitle("Student's Id Information");
        
        student_option_info_gridPane.add(department_lb, 0, 0, 1, 1);
        student_option_info_gridPane.add(department_box, 1, 0, 1, 1);
        student_option_info_gridPane.add(option_lbl, 2, 0, 1, 1);
        student_option_info_gridPane.add(option_box, 3, 0, 1, 1);
        student_option_info_gridPane.add(level_lbl, 0, 1, 1, 1);
        student_option_info_gridPane.add(level_box, 1, 1, 1, 1);
        
        student_option_info_gridPane.setAlignment(Pos.TOP_CENTER);
        student_option_info_gridPane.setVgap(10);
        student_option_info_gridPane.setHgap(20);
        student_option_info_gridPane.setPadding(new Insets(15));
        student_option_info_gridPane.setBackground(Background.EMPTY);
        student_option_info_groupBox.getChildren().add(student_option_info_gridPane);
        student_option_info_groupBox.setTitle("Student's Option Information");
        
        student_address_info_gridPane.add(phone1_lbl, 0, 0, 1, 1);
        student_address_info_gridPane.add(phone1_txt, 1, 0, 1, 1);
        student_address_info_gridPane.add(phone2_lbl, 2, 0, 1, 1);
        student_address_info_gridPane.add(phone2_txt, 3, 0, 1, 1);
        student_address_info_gridPane.add(email_lbl, 0, 1, 1, 1);
        student_address_info_gridPane.add(email_txt, 1, 1, 1, 1);
        student_address_info_gridPane.add(pic_lbl, 2, 1, 1, 1);
        student_address_info_gridPane.add(pic_Hbox, 3, 1, 1, 1);
        student_address_info_gridPane.add(homeTown_lbl, 0, 2, 1, 1);
        student_address_info_gridPane.add(homeTown_txt, 1, 2, 1, 1);
        student_address_info_gridPane.add(parent1_lbl, 0, 3, 1, 1);
        student_address_info_gridPane.add(parent1_txt, 1, 3, 1, 1);
        student_address_info_gridPane.add(parent2_lbl, 2, 3, 1, 1);
        student_address_info_gridPane.add(parent2_txt, 3, 3, 1, 1);
        
        student_address_info_gridPane.setAlignment(Pos.TOP_CENTER);
        student_address_info_gridPane.setVgap(10);
        student_address_info_gridPane.setHgap(20);
        student_address_info_gridPane.setPadding(new Insets(15));
        student_address_info_gridPane.setBackground(Background.EMPTY);
        student_address_info_groupBox.getChildren().add(student_address_info_gridPane);
        student_address_info_groupBox.setTitle("Student's Address Information");
        
        tail_gridPane.add(note_lbl, 0, 0, 1, 1);
        tail_gridPane.add(note_txt, 1, 0, 3, 1);
        tail_gridPane.add(save_btn, 2, 1, 1, 1);
        tail_gridPane.setAlignment(Pos.TOP_CENTER);
        tail_gridPane.setVgap(10);
        tail_gridPane.setHgap(20);
        tail_gridPane.setPadding(new Insets(15));
        tail_gridPane.setBackground(Background.EMPTY);
        
        root_vBox.getChildren().addAll(student_id_info_groupBox, student_option_info_groupBox, student_address_info_groupBox, tail_gridPane);
        root_vBox.setAlignment(Pos.TOP_CENTER);
        root_vBox.setPadding(new Insets(10, 5, 5, 5));
        root_vBox.setSpacing(10);
        
        initChoiceBoxes();
    }
    
    /**
     * 
     */
    private void initChoiceBoxes(){
        sexList.addAll("Male", "Female");
        departmentList.addAll("Computer Engineering", "Electrical Engineering", "HND");
        levelList.addAll("200","300","400");
        optionList.addAll("Software Engineering", "Computer Networks", "Electrical Engineering", "Telecomunication", "EPS", "ICT");
        sex_box.getItems().addAll(sexList);
        department_box.getItems().addAll(departmentList);
        level_box.getItems().addAll(levelList);
        option_box.getItems().addAll(optionList);
    }
    
}
