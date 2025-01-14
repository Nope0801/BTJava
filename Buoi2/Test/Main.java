package Buoi2.Test;

public class Main {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.nhap();
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n", "Ho ten", "Gioi tinh", "SDT", "SDT");
        hs.xuat();
    }
}
