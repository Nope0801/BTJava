package Buoi6BTVN.SinhVien;

import java.util.Scanner;

public class SinhVien {
    protected String ma;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected double diemDaiCuong;
    protected double diemChuyenTri;
    protected double diemPhapLuat;

    public SinhVien() {
        this.ma = "";
        this.hoTen = "";
        this.ngaySinh = "";
        this.gioiTinh = "";
        this.diemDaiCuong = 0.0;
        this.diemChuyenTri = 0.0;
        this.diemPhapLuat = 0.0;
    }

    public SinhVien(String ma, String hoTen, String ngaySinh, String gioiTinh, double diemDaiCuong, double diemChuyenTri, double diemPhapLuat) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;

        this.diemDaiCuong = diemDaiCuong;
        this.diemChuyenTri = diemChuyenTri;
        this.diemPhapLuat = diemPhapLuat;
    }
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma: ");
        this.ma = scanner.nextLine();
        while (true) {
            System.out.print("Ho ten: ");
            this.hoTen = scanner.nextLine();
            if (hoTen.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Ho ten chi duoc chua cac ky tu tu a -> z va khoang trang.");
            }
        }
        System.out.print("Ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        while (true) {
            System.out.print("Gioi tinh (Nam/Nu/Khac): ");
            this.gioiTinh = scanner.nextLine();
            if (gioiTinh.equals("Nam") || gioiTinh.equals("Nu") || gioiTinh.equals("Khac")) {
                break;
            } else {
                System.out.println("Gioi tinh khong hop le!");
            }
        }

        while (true) {
            System.out.print("Diem dai cuong: ");
            if (scanner.hasNextDouble()) {
                this.diemDaiCuong = scanner.nextDouble();
                if (diemDaiCuong >= 0 && diemDaiCuong <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next();
            }
        }
        this.diemDaiCuong = scanner.nextDouble();
        System.out.print("Diem chuyen tri: ");
        while (true) {
            System.out.print("Diem chuyen tri: ");
            if (scanner.hasNextDouble()) {
                this.diemChuyenTri = scanner.nextDouble();
                if (diemChuyenTri >= 0 && diemChuyenTri <= 10) {
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
            System.out.print("Diem phap luat: ");
            if (scanner.hasNextDouble()) {
                this.diemPhapLuat = scanner.nextDouble();
                if (diemPhapLuat >= 0 && diemPhapLuat <= 10) {
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
    public void hienThiThongTin() {
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Diem dai cuong: " + diemDaiCuong);
        System.out.println("Diem chuyen tri: " + diemChuyenTri);
        System.out.println("Diem phap luat: " + diemPhapLuat);
    }
}
