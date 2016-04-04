package cot.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginView extends Stage {

    Label username_lbl = new Label("Username: ");
    Label pin_lbl = new Label("PIN: ");
    TextField username_txt = new TextField();
    PasswordField pin_txt = new PasswordField();
    Button login_btn = new Button("Login");
    Button zero_btn = new Button("0");
    Button one_btn = new Button("1");
    Button two_btn = new Button("2");
    Button three_btn = new Button("3");
    Button four_btn = new Button("4");
    Button five_btn = new Button("5");
    Button six_btn = new Button("6");
    Button seven_btn = new Button("7");
    Button eight_btn = new Button("8");
    Button nine_btn = new Button("9");
    Label feedBack_lbl = new Label("");

    GridPane root_gridView = new GridPane();

    Scene scene = new Scene(root_gridView, 350, 330, Color.SPRINGGREEN);

    public void initialize() {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.GRAY);
        dropShadow.setOffsetY(0.3);
        int fontsize = 20;
        feedBack_lbl.setTextFill(Color.RED);
        username_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        pin_lbl.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        login_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        zero_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        one_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        two_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        three_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        four_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        five_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        six_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        seven_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        eight_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        nine_btn.setFont(Font.font("Tahoma", FontWeight.BOLD, fontsize));
        
        username_txt.setMinWidth(150);
        pin_txt.setMinWidth(150);

        root_gridView.setBackground(Background.EMPTY);
        root_gridView.setEffect(dropShadow);
        root_gridView.setAlignment(Pos.CENTER);

        root_gridView.add(feedBack_lbl, 1, 0, 4, 1);
//        root_gridView.add(username_lbl, 0, 1, 1, 1);
        root_gridView.add(username_txt, 1, 1, 3, 1);
//        root_gridView.add(pin_lbl, 0, 2, 1, 1);
        root_gridView.add(pin_txt, 1, 2, 3, 1);
        root_gridView.add(seven_btn, 1, 3);
        root_gridView.add(eight_btn, 2, 3);
        root_gridView.add(nine_btn, 3, 3);
        root_gridView.add(four_btn, 1, 4);
        root_gridView.add(five_btn, 2, 4);
        root_gridView.add(six_btn, 3, 4);
        root_gridView.add(one_btn, 1, 5);
        root_gridView.add(two_btn, 2, 5);
        root_gridView.add(three_btn, 3, 5);
        root_gridView.add(zero_btn, 1, 6);
        root_gridView.add(login_btn, 2, 6, 2, 1);
        root_gridView.setHgap(10);
        root_gridView.setVgap(10);
        root_gridView.setPadding(new Insets(0));
        
        username_txt.setPromptText("username");
        pin_txt.setPromptText("pin");
    }
}
