package Buoi11.BT3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point2D> dsDiem2D = new ArrayList<>();
        ArrayList<Point3D> dsDiem3D = new ArrayList<>();
        ArrayList<Point2D> dsDoiXung2D = new ArrayList<>();
        ArrayList<Point3D> dsDoiXung3D = new ArrayList<>();

        System.out.print("Nhap so luong diem 2D: ");
        int n = sc.nextInt();
        System.out.println("\n=== NHAP THONG TIN DIEM 2D ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap diem 2D thu " + (i + 1) + ":");
            System.out.print("x = ");
            double x = sc.nextDouble();
            System.out.print("y = ");
            double y = sc.nextDouble();
            dsDiem2D.add(new Point2D(x, y));
        }

        System.out.print("\nNhap so luong diem 3D: ");
        int m = sc.nextInt();
        System.out.println("\n=== NHAP THONG TIN DIEM 3D ===");
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap diem 3D thu " + (i + 1) + ":");
            System.out.print("x = ");
            double x = sc.nextDouble();
            System.out.print("y = ");
            double y = sc.nextDouble();
            System.out.print("z = ");
            double z = sc.nextDouble();
            dsDiem3D.add(new Point3D(x, y, z));
        }
        double tongKhoangCach2D = 0;
        for (Point2D p : dsDiem2D) {
            tongKhoangCach2D += p.khoangCachDenGoc();
        }
        System.out.printf("\nTong khoang cach cac diem 2D den goc: %.2f\n", tongKhoangCach2D);
        double tongKhoangCach3D = 0;
        for (Point3D p : dsDiem3D) {
            tongKhoangCach3D += p.khoangCachDenGoc();
        }
        System.out.printf("Tong khoang cach cac diem 3D den goc: %.2f\n", tongKhoangCach3D);
        for (Point2D p : dsDiem2D) {
            dsDoiXung2D.add(p.doiXungQuaGoc());
        }
        for (Point3D p : dsDiem3D) {
            dsDoiXung3D.add(p.doiXungQuaGoc());
        }
        System.out.println("\n=== DANH SACH DIEM 2D ===");
        for (int i = 0; i < dsDiem2D.size(); i++) {
            System.out.print("Diem 2D " + (i + 1) + ": ");
            dsDiem2D.get(i).hienThi();
        }
        System.out.println("\n=== DANH SACH DIEM DOI XUNG 2D ===");
        for (int i = 0; i < dsDoiXung2D.size(); i++) {
            System.out.print("Diem doi xung 2D " + (i + 1) + ": ");
            dsDoiXung2D.get(i).hienThi();
        }
        System.out.println("\n=== DANH SACH DIEM 3D ===");
        for (int i = 0; i < dsDiem3D.size(); i++) {
            System.out.print("Diem 3D " + (i + 1) + ": ");
            dsDiem3D.get(i).hienThi();
        }
        System.out.println("\n=== DANH SACH DIEM DOI XUNG 3D ===");
        for (int i = 0; i < dsDoiXung3D.size(); i++) {
            System.out.print("Diem doi xung 3D " + (i + 1) + ": ");
            dsDoiXung3D.get(i).hienThi();
        }
    }
}
        