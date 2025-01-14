package TH1.Bai12;

import java.util.Scanner;

public class HinhTron {
    private double banKinh;
    public HinhTron(){
        this.banKinh = 0;
    }
    public HinhTron(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            throw new IllegalArgumentException("Ban kinh phai lon hon 0");
        }
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap ban kinh: ");
            this.banKinh = sc.nextDouble();
        }while(banKinh <= 0);
        sc.close();
    }
    public void xuat(){
        System.out.println("Chu vi hinh tron la: " + tinhChuVi());
        System.out.println("Dien tich hinh tron la: " + tinhDienTich());
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

}