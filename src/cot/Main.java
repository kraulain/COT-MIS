package cot;

import cot.entities.User;
import cot.views.HomeController;
import cot.views.HomeView;
import cot.views.LoginController;
import cot.views.LoginView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {
    User user = new User();
    @Override
    public void start(Stage primaryStage) { 
        int i;
        if (login()) {
            home(user);
        } else {
            Platform.exit();
        }
    }
    
    private boolean login() {
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView);
        user = loginController.user;
        return loginController._grantAccess;
    }

    private void home(User u) {
        HomeView homeView = new HomeView(u);
        HomeController homeController = new HomeController(homeView);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
