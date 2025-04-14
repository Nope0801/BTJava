package Buoi11.BT4;

import java.util.Scanner;

public class Teacher extends Person {
    private int soGioDay;
    private float luongCoBan;
    private float luongPhuCap;

    public float tinhThuNhap(){
        return luongPhuCap+luongCoBan;
    }

    public Teacher() {
        super();
    }

    public Teacher(String hoTen, int namSinh, String que, int soGioDay) {
        super(hoTen, namSinh, que);
        this.soGioDay = soGioDay;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("So Gio Day: ");
        this.soGioDay = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("So Gio Day: "+ soGioDay);
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }
}
