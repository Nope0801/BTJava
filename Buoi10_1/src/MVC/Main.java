package MVC;

import MVC.Controller.LoginController;
import MVC.View.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);

        control.login();
    }
}
