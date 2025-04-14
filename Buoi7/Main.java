package Buoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        System.err.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            System.out.print("1. Sinh vien CNTT\n2. Sinh vien Kinh te\nChon: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                SinhVienCNTT sv = new SinhVienCNTT();
                sv.nhapThongTin();
                sinhVien.add(sv);
            } else if (choose == 2) {
                SinhVienKinhTe sv = new SinhVienKinhTe();
                sv.nhapThongTin();
                sinhVien.add(sv);
            }
        }
        System.out.println("\nDanh sach sinh vien da nhap:");
        for (SinhVien sv : sinhVien) {
            sv.hienThiThongTin();
            System.out.println("-------------------------");
        }
        scanner.close();
    }
}

