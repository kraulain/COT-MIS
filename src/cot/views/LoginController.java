package cot.views;

import cot.entities.User;
import javafx.scene.control.Button;

public class LoginController {

    LoginView stage;
    public boolean _grantAccess = false;
    public User user = new User();

    public LoginController(LoginView stage) {
        stage.initialize();
        stage.setScene(stage.scene);
        stage.setTitle("Login");
        this.stage = stage;
        registerEventsListeners();
        this.stage.showAndWait();
    }

    private void registerEventsListeners() {
        stage.login_btn.setOnAction(event -> login_btnClicked());
        stage.zero_btn.setOnAction(event -> keypressed(stage.zero_btn));
        stage.one_btn.setOnAction(event -> keypressed(stage.one_btn));
        stage.two_btn.setOnAction(event -> keypressed(stage.two_btn));
        stage.three_btn.setOnAction(event -> keypressed(stage.three_btn));
        stage.four_btn.setOnAction(event -> keypressed(stage.four_btn));
        stage.five_btn.setOnAction(event -> keypressed(stage.five_btn));
        stage.six_btn.setOnAction(event -> keypressed(stage.six_btn));
        stage.seven_btn.setOnAction(event -> keypressed(stage.seven_btn));
        stage.eight_btn.setOnAction(event -> keypressed(stage.eight_btn));
        stage.nine_btn.setOnAction(event -> keypressed(stage.nine_btn));
       
    }

    private void login_btnClicked() {
        stage.feedBack_lbl.setText("temporal pass");
        _grantAccess = true;
        user.setIsAdmin(true);
        user.setRole("SECRETARY");
        stage.close();
    }
    
    private void keypressed(Button b){
        stage.pin_txt.setText(stage.pin_txt.getText().toString() + b.getText().toString());
    }

}
