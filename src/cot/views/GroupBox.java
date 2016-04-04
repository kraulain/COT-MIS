/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cot.views;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KKYB
 */
/*
The GroupBox container or TitledBorderPane doesnot exist in javafx.
This is a custom Stackpane that has the same behaviour as a GroupBox.
It is madeup of(has as child nodes) a Stackpane that holds the content of
the container and a label which acts as the title of the GroupBox.
The title can be retrieved and styled by using the getTitle() method.
*/
public class GroupBox extends StackPane{
    
    private final Label title;
    private final StackPane content;
    
    public GroupBox(){
        
        this.title = new Label("title");
        this.title.setPadding(new Insets(0, 20, 0, 20));
        StackPane.setAlignment(this.title, Pos.TOP_LEFT);
        StackPane.setMargin(this.title, new Insets(-10, 30, 0, 30));
        this.title.setStyle("-fx-background-color: whitesmoke;");        
                
        this.content = new StackPane();
        
        super.getChildren().addAll(this.content, this.title);
        this.setStyle("-fx-border-width: 1; -fx-border-color: black; "
                + "-fx-background-radius: 4 4 4 4; -fx-border-radius: 4 4 4 4;");
    }
    
    public GroupBox(Node content){
        
        this.title = new Label("title");
        this.title.setPadding(new Insets(0, 20, 0, 20));
        StackPane.setAlignment(this.title, Pos.TOP_LEFT);
        StackPane.setMargin(this.title, new Insets(-10, 30, 0, 30));
        this.title.setStyle("-fx-background-color: whitesmoke;");
                
        this.content = new StackPane();
        this.content.getChildren().add(content);
        
        super.getChildren().addAll(this.content, this.title);
        this.setStyle("-fx-border-width: 1; -fx-border-color: black; "
                + "-fx-background-radius: 4 4 4 4; -fx-border-radius: 4 4 4 4;");  
    }
    
    public GroupBox(String title, Node content){
        
        this.title = new Label(title);
        this.title.setPadding(new Insets(0, 20, 0, 20));
        StackPane.setAlignment(this.title, Pos.TOP_LEFT);
        StackPane.setMargin(this.title, new Insets(-10, 30, 0, 30));
        this.title.setStyle("-fx-background-color: whitesmoke;");
                
        this.content = new StackPane();
        this.content.getChildren().add(content);
        
        super.getChildren().addAll(this.content, this.title);
        this.setStyle("-fx-border-width: 1; -fx-border-color: black; "
                + "-fx-background-radius: 4 4 4 4; -fx-border-radius: 4 4 4 4;");  
    }
    
    public Label getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title.setText(title);        
    }
        
    @Override
    public ObservableList<Node> getChildren(){
        return this.content.getChildren();
    }
}
