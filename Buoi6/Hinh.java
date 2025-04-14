package Buoi6;

import java.util.Scanner;

public class Hinh {
    private double x, y;
    //, z, r;
    public Hinh(){}
    public Hinh(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void nhap(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap x: ");
            x = sc.nextDouble();
            System.out.println("Nhap y: ");
            y = sc.nextDouble();
        }
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    // public double getZ() {
    //     return z;
    // }
    // public double getR() {
    //     return r;
    // }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    // public void setZ(double z) {
    //     this.z = z;
    // }
    // public void setR(double r) {
    //     this.r = r;
    // }
    public double tinhChuVi(){
        return 0;
    }
    public double tinhDienTich(){
        return 0;
    }
}
