package MVC.Controller;

import MVC.Model.SinhVien;
import MVC.View.LoginView;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {
    private LoginView view;

    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<SinhVien> sinhViens = new ArrayList<>();
    public LoginController(LoginView view){
        this.view = view;
        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
           SinhVien sinhVien = view.getInfo();
           sinhViens.add(sinhVien);
        }
        scanner.close();
    }
    public void print(){
        for(SinhVien sv : sinhViens){
            sv.hienThiThongTin();
        }
    }
}
