package MVC.View;

import MVC.Model.LoginModel;
import MVC.Model.SinhVien;

import java.util.Scanner;

public class LoginView {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.print(msg);
    }

    public SinhVien getInfo(){
        System.out.println("-___LOGIN____");
        LoginModel user = new LoginModel();
        System.out.print("Username: ");
        user.setUser(scanner.next());
        System.out.print("Password: ");
        user.setPass(scanner.next());
        System.out.println("___________");
        return user;
    }
}
