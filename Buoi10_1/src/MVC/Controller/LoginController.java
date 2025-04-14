package MVC.Controller;

import MVC.Model.LoginModel;
import MVC.View.LoginView;

public class LoginController {
    private LoginView view;

    public LoginController(LoginView view){
        this.view = view;
    }

    private boolean check(LoginModel user){
        return (user.getUser().equals("admin"))&& (user.getPass().equals("123"));
    }

    public void login(){
        while(true){
            LoginModel user = view.getInfo();
            if(check(user)){
                view.showMessage("=>Login successfully");
                break;
            }
            else{
                view.showMessage("=>Wrong username or password");
            }
        }
    }

    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

}