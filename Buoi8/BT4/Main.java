package Buoi8.BT4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> dsSinhVien = new ArrayList<>();
        ArrayList<Teacher> dsGiangVien = new ArrayList<>();

        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        // Nhập thông tin sinh viên
        System.out.println("\n=== NHAP THONG TIN SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sinh vien " + (i + 1) + ":");
            Student sv = new Student();
            sv.nhap();
            dsSinhVien.add(sv);
        }

        // Nhập số lượng giảng viên
        System.out.print("\nNhap so luong giang vien: ");
        int m = sc.nextInt();

        // Nhập thông tin giảng viên
        System.out.println("\n=== NHAP THONG TIN GIANG VIEN ===");
        for (int i = 0; i < m; i++) {
            System.out.println("\nNhap thong tin giang vien " + (i + 1) + ":");
            Teacher gv = new Teacher();
            gv.nhap();
            dsGiangVien.add(gv);
        }

        // Xuất thông tin sinh viên
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println("\nSinh vien " + (i + 1) + ":");
            dsSinhVien.get(i).xuat();
        }

        // Xuất thông tin giảng viên
        System.out.println("\n=== DANH SACH GIANG VIEN ===");
        for (int i = 0; i < dsGiangVien.size(); i++) {
            System.out.println("\nGiang vien " + (i + 1) + ":");
            dsGiangVien.get(i).xuat();
        }
    }
}