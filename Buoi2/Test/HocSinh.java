package Buoi2.Test;
import java.util.Scanner;

public class HocSinh {
    String hoTen;
    String gioiTinh;
    String sdt;
    float dtb;
    HocSinh(){}
    HocSinh(String hoTen, String gioiTinh, String sdt, float dtb){
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.dtb = dtb;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
        sc.close();
    }
    void xuat(){
        System.out.printf("|%-15s|%-15s|%-15s|%-15f|", hoTen, gioiTinh, sdt, dtb);
    }
}
