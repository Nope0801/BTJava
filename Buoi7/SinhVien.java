package Buoi7;

import java.util.Scanner;

abstract public class SinhVien {
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private double diemDaiCuong;
    private double diemChuyenTri;
    private double diemPhapLuat;

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
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma: ");this.ma = scanner.nextLine();
        System.err.print("Nhap ho ten: ");this.hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh (DD/MM/YY): ");this.ngaySinh = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");this.gioiTinh = scanner.nextLine();
        System.out.print("Nhap diem dai cuong: ");this.diemDaiCuong = scanner.nextDouble();
        System.out.print("Nhap diem chuyen tri: ");this.diemChuyenTri = scanner.nextDouble();
        System.out.print("Nhap diem phap luat: ");this.diemPhapLuat = scanner.nextDouble();
    }
    public void hienThiThongTin(){
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Diem dai cuong: " + diemDaiCuong);
        System.out.println("Diem chuyen tri: " + diemChuyenTri);
        System.out.println("Diem phap luat: " + diemPhapLuat);
    }
    abstract public double getDiem();
    public String xepLoai(){
        String xl;
        if(getDiem() >= 9.0){
            xl = "Xuat sac";
        }else if(getDiem() >= 8.0){
            xl = "Gioi";
        }else if(getDiem() >= 7.0){
            xl = "Kha";
        }else if(getDiem() >= 5.0){
            xl = "Trung binh";
        }else{
            xl = "Yeu";
        }
        return xl;
    }
    
}
