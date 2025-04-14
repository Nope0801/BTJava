package Buoi8.BT4;

import java.util.Scanner;

abstract public class Person {
    private String hoTen;
    private int namSinh;
    private String que;
    public Person() {}
    public Person(String hoTen, int namSinh, String que) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.que = que;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap que quan: ");
        que = sc.nextLine();
    }
    public void xuat(){
        System.out.print("Ho ten: " + hoTen);
        System.out.print("Nam sinh: " + namSinh);
        System.out.print("Que: " + que);
    }
}
