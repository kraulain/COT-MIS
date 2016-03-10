package cot.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FindStudentTab extends Tab{

    TextField find_txt = new TextField();
    Button find_btn = new Button("Find");
    TableView result_table = new TableView();

    HBox find_HBox = new HBox();
    VBox root_VBox = new VBox();
    

     public void initialize() {
         find_HBox.getChildren().addAll(find_txt,find_btn);
         root_VBox.getChildren().addAll(find_HBox,result_table);
         
         find_txt.setMinWidth(300);
         find_HBox.setAlignment(Pos.CENTER);
         find_HBox.setSpacing(10);
         root_VBox.setAlignment(Pos.TOP_CENTER);
         root_VBox.setSpacing(20);
         root_VBox.setPadding(new Insets(10));
    }
}
