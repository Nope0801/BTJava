package Buoi6BTVN.SinhVien;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien{
    private double dsa;
    private double toanRR;
    private double csdl;
    private double oop;
    public SinhVienCNTT(){}
    public SinhVienCNTT(String ma, String hoTen, String ngaySinh, String gioiTinh, String tinh, double diemDaiCuong, double diemChuyenTri, double diemPhapLuat, double dsa, double toanRR, double csdl, double oop) {
        super(ma, hoTen, ngaySinh, gioiTinh, diemDaiCuong, diemChuyenTri, diemPhapLuat);
        this.dsa = dsa;
        this.toanRR = toanRR;
        this.csdl = csdl;
        this.oop = oop;
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap sinh vien cong nghe thong tin");
        while (true) {
            System.out.print("Nhap diem dsa: ");
            if (scanner.hasNextDouble()) {
                this.dsa = scanner.nextDouble();
                if (dsa >= 0 && dsa <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next();
            }
        }
        
        while (true) {
            System.out.print("Nhap diem toan RR: ");
            if (scanner.hasNextDouble()) {
                this.toanRR = scanner.nextDouble();
                if (toanRR >= 0 && toanRR <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next();
            }
        }
        
        while (true) {
            System.out.print("Nhap diem csdl: ");
            if (scanner.hasNextDouble()) {
                this.csdl = scanner.nextDouble();
                if (csdl >= 0 && csdl <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next();
            }
        }
        while (true) {
            System.out.print("Nhap diem oop: ");
            if (scanner.hasNextDouble()) {
                this.oop = scanner.nextDouble();
                if (oop >= 0 && oop <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next();
            }
        }
        scanner.close();
    }
    public double diemTB() {
        return (diemDaiCuong + diemChuyenTri + diemPhapLuat + dsa + toanRR + csdl + oop) / 7;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Diem dsa: " + dsa);
        System.out.println("Diem toan RR: " + toanRR);
        System.out.println("Diem csdl: " + csdl);
        System.out.println("Diem oop: " + oop);
        System.out.println("Diem trung binh: " + diemTB());
        System.out.println("Xep loai: " + xepLoaiHocTap());
        
    }
    public String xepLoaiHocTap() {
        double diemTB = diemTB();
        if (diemTB >= 8.5) return "Xuat sac";
        else if (diemTB >= 7.0) return "Gioi";
        else if (diemTB >= 5.5) return "Kha";
        else if (diemTB >= 4.0) return "Trung binh";
        else return "Yeu";
    }
}
