package Buoi11.BT4;

import java.util.Scanner;

public class Student extends Person {
    private float diemTB;

    public Student() {}

    public Student(String hoTen, int namSinh, String que, float diemTB) {
        super(hoTen, namSinh, que);
        this.diemTB = diemTB;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem trung binh: ");
        diemTB = sc.nextFloat();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Nhap diem trung binh: " + diemTB);
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String xepLoai() {
        if (diemTB >= 8.0) return "Gioi";
        else if (diemTB >= 6.5) return "Kha";
        else if (diemTB >= 5.0) return "Trung binh";
        else return "Yeu";
    }
}
