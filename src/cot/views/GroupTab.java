package cot.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GroupTab extends Tab {
    HBox root_hBox = new HBox();
    ListView group_list;
    VBox control_box = new VBox();
    TextField title_txt = new TextField();
    Button save_btn = new Button("Save");
    Button edit_btn = new Button("Edit");
    Button delete_btn = new Button("Delete");
    
    public void initialize(){
        title_txt.setPromptText("title");
        control_box.setAlignment(Pos.CENTER);
        control_box.setSpacing(20);
        control_box.setPadding(new Insets(10));
        control_box.getChildren().addAll(title_txt,save_btn,edit_btn,delete_btn);
        
        group_list = new ListView();
        root_hBox.setPadding(new Insets(10));
        root_hBox.setAlignment(Pos.TOP_CENTER);
        root_hBox.getChildren().addAll(group_list,control_box);
    }
}
