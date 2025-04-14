package Buoi6BTVN.SinhVien;

import java.util.Scanner;

public class SinhVienKinhTe extends SinhVien{
    private double KinhTeViMo;
    private double KinhTeVixMo;
    private double luatKinhTe;
    public SinhVienKinhTe(){}
    public SinhVienKinhTe(String ma, String hoTen, String ngaySinh, String gioiTinh, String tinh,double diemDaiCuong, double diemChuyenTri, double diemPhapLuat, double KinhTeViMo, double KinhTeVixMo, double luatKinhTe) {
        super(ma, hoTen, ngaySinh, gioiTinh, diemDaiCuong, diemChuyenTri, diemPhapLuat);
        this.KinhTeViMo = KinhTeViMo;
        this.KinhTeVixMo = KinhTeVixMo;
        this.luatKinhTe = luatKinhTe;
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();  
        System.err.println("Nhap sinh vien kinh te");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Kinh te vi mo: ");
            if (scanner.hasNextDouble()) {
                this.KinhTeViMo = scanner.nextDouble();
                if (KinhTeViMo >= 0 && KinhTeViMo <= 10) {
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
            System.out.print("Kinh te vĩ mo: ");
            if (scanner.hasNextDouble()) {
                this.KinhTeVixMo = scanner.nextDouble();
                if (KinhTeVixMo >= 0 && KinhTeVixMo <= 10) {
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
            System.out.print("Luat kinh te: ");
            if (scanner.hasNextDouble()) {
                this.luatKinhTe = scanner.nextDouble();
                if (luatKinhTe >= 0 && luatKinhTe <= 10) {
                    break;
                } else {
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            } else {
                System.out.println("Vui long nhap mot so hop le.");
                scanner.next(); 
            }
        }

    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Kinh te vi mo: " + KinhTeViMo);
        System.out.println("Kinh te vix mo: " + KinhTeVixMo);
        System.out.println("Luat kinh te: " + luatKinhTe);
        System.out.println("Diem trung binh: " + diemTB());
        System.out.println("Xep loai hoc tap: " + xepLoaiHocTap());

    }
    public double diemTB() {
        return (diemDaiCuong + diemChuyenTri + diemPhapLuat + KinhTeViMo + KinhTeVixMo + luatKinhTe) / 6;
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
