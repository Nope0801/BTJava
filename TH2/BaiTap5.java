package TH2;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma nhan vien(3 chu, 3 so)");
        String manhanvien = sc.nextLine();
        while (!manhanvien.matches("[a-zA-Z]{3}[0-9]{3}")) {
            System.out.println("ma nhan vien khong hop le vui long nhap lai: ");
            manhanvien = sc.nextLine();            
        }
        System.out.println("nhap ho va ten (toi thieu 5 ki tu): ");
        String hoten = sc.nextLine();
        while (hoten.length()<5) {
            System.out.println("ho va ten ko hop le vui long nhan lai: ");
            hoten = sc.nextLine();
        }
        System.out.println("nhap dia chi (toi da 30 ki tu): ");
        String diachi = sc.nextLine();
        while (diachi.length()>30) {
            System.out.println("dia chi ko hop le vui long nhan lai: ");
            diachi = sc.nextLine();
        }
        System.out.println("nhap so dien thoai");
        String sodt = sc.nextLine();
        while (!sodt.matches("[0-9]{10}")) {
            System.out.println("sdt ko hop le vui long nhan lai: ");
            sodt = sc.nextLine();
        }
        System.out.println("nhap ngay sinh ");
        String ngaysinh = sc.nextLine();
        while (!ngaysinh.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
            System.out.println("vui long nhap dung dinh dang dd-mm-yyyy");
            ngaysinh = sc.nextLine();
        }
        ngaysinh = '-'+ngaysinh+'-';
        String a[]=ngaysinh.split("-");
        int ngay=Integer.parseInt(a[1]);
        int thang=Integer.parseInt(a[2]);
        int nam=Integer.parseInt(a[3]);
        while (ngay<1||ngay>31||thang<1||thang>12||nam<1900||nam>2025) {
            System.out.println("ngay sinh ko hop le vui long nhan lai: ");
            ngaysinh = sc.nextLine();
            while (!ngaysinh.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
                System.out.println("vui long nhap dung dinh dang dd-mm-yyyy");
                ngaysinh = sc.nextLine();
            }
            ngaysinh = '-'+ngaysinh+'-';
            a=ngaysinh.split("-");
            ngay=Integer.parseInt(a[1]);
            thang=Integer.parseInt(a[2]);
            nam=Integer.parseInt(a[3]);
        }
        System.out.println("nhap email");
        String email = sc.nextLine();
        while (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("email ko hop le vui long nhap lai");
            email = sc.nextLine();
        }
        System.out.print("nhap so cccd (9 so)): ");
        String socccd = sc.nextLine();
        while (!socccd.matches("\\d{9}")) {
            System.out.print("so cccd ko hop le vui long nhap lai ");
            socccd = sc.nextLine();
        }
    }
    
}
