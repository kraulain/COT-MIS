package cot.views;

import cot.entities.User;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HomeView extends Stage {
    
    User user = new User();
    
    public HomeView(User user) {
        this.user = user;
    }

    VBox root_VBox = new VBox();
    HBox header_hBox = new HBox();
    SplitPane splitPane = new SplitPane();
    VBox nav_VBox = new VBox();
    VBox contentArea_VBox = new VBox();
    ToolBar toolBar = new ToolBar();
    TabPane tabPane = new TabPane();
    Tab main_tab = new Tab("Home");
    TilePane tilePane = new TilePane();
    HBox search_HBox = new HBox();
    TextField search_txt = new TextField();
    Button search_btn = new Button("Search");
    Button refresh_btn = new Button("Refresh");
    Navbar navbar;

    Label temp = new Label("Header");

    Scene scene = new Scene(root_VBox, 1000, 900, Color.SPRINGGREEN);

    public void initialize() {
         navbar = new Navbar(user);
         temp.setText(user.getRole());
         
        initSearchBox();
        initNav();
        initTabPane();
        //search_btn.setGraphic(new ImageView(new Image("cot/rsc/magnifier_icon.png")));
        toolBar.getItems().add(refresh_btn);
        header_hBox.getChildren().add(temp);
        contentArea_VBox.getChildren().addAll(toolBar, tabPane);
        splitPane.getItems().addAll(nav_VBox, contentArea_VBox);
        splitPane.setOrientation(Orientation.HORIZONTAL);
        splitPane.setDividerPositions(0.2);

        root_VBox.getChildren().addAll(header_hBox, splitPane);
        root_VBox.setBackground(Background.EMPTY);
        root_VBox.setAlignment(Pos.TOP_CENTER);
        root_VBox.setPadding(new Insets(10));
    }

    private void initSearchBox() {
        search_HBox.getChildren().addAll(search_txt, search_btn);
        search_HBox.setAlignment(Pos.CENTER);
        search_HBox.setSpacing(5);
        search_HBox.setMinWidth(100);
    }
    
    private void initNav(){
        nav_VBox.setMinWidth(100);
        navbar.initialize();
        navbar.getChildren().addAll(navbar.students_pane,navbar.notice_pane,navbar.message_pane);
        
        if(user.isIsAdmin()){
            navbar.getChildren().add(navbar.admin_pane);
        }
        
        nav_VBox.setSpacing(5);
        nav_VBox.setPadding(new Insets(5));
        nav_VBox.getChildren().addAll(search_HBox,navbar);
    }
    
    private void initTabPane(){
        tabPane.setMinHeight(600);
        main_tab.setClosable(false);
        main_tab.setGraphic(new ImageView(new Image("cot/rsc/home_icon.png")));
        main_tab.setStyle("-fx-background-color: lightgreen");
        main_tab.setContent(tilePane);
        tabPane.getTabs().add(main_tab);
        
    }
}
