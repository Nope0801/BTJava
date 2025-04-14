package MVC.View;

import MVC.Model.SinhVien;
import java.util.Scanner;


public class LoginView {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.print(msg);
    }
    
    public SinhVien getInfo(){
        // System.out.println("Chon nganh: ");
        // System.out.println("1. Sinh vien cong nghe thong tin");
        // System.out.println("2. Sinh vien kinh te");
        // int choose = scanner.nextInt();
        // if(choose == 1){
        //     SinhVienCNTT sv = new SinhVienCNTT();
        //     sv.nhapThongTin();
        //     return sv;
        // }
        // else(choose == 2){
        //     SinhVienKinhTe sv = new SinhVienKinhTe();
        //     sv.nhapThongTin();
        //     return sv;
        // }

        
        System.out.println("-___LOGIN____");
        System.out.println("1. Sinh vien cong nghe thong tin");
        System.out.print("2. Sinh vien kinh te");
        int choose = scanner.nextInt();
        if(choose == 1){
            SinhVien sv = new  SinhVienCNTT();
            sv.nhapThongTin();
            System.out.println("___________");

            return sv;
        }
        else if(choose == 2){
            SinhVien sv = new SinhVienKinhTe();
            sv.nhapThongTin();
            System.out.println("___________");
            return sv;
        }
        return null;
        System.out.println("-___LOGIN____");
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapThongTin();
        System.out.println("___________");
        return sinhVien;
    }
}
