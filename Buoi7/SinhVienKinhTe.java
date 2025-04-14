package Buoi7;

import java.util.Scanner;

public class SinhVienKinhTe extends SinhVien{
    private double kinhTeViMo;
    private double kinhTeVixMo;
    private double luatKinhTe;
    public SinhVienKinhTe(){
        super();
        this.kinhTeViMo = 0.0;
        this.kinhTeVixMo = 0.0;
        this.luatKinhTe = 0.0;
    };
    public SinhVienKinhTe(String ma, String hoTen, String ngaySinh, String gioiTinh, double diemDaiCuong, double diemChuyenTri, double diemPhapLuat, double kinhTeViMo, double kinhTeVixMo, double luatKinhTe){
        super(ma, hoTen, ngaySinh, gioiTinh, diemDaiCuong, diemChuyenTri, diemPhapLuat);
        this.kinhTeViMo = kinhTeViMo;
        this.kinhTeVixMo = kinhTeVixMo;
        this.luatKinhTe = luatKinhTe;
    }
    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap diem kinh te vi mo: ");this.kinhTeViMo = scanner.nextDouble();
        System.out.print("Nhap diem kinh te vix mo: ");this.kinhTeVixMo = scanner.nextDouble();
        System.out.print("Nhap diem luat kinh te: ");this.luatKinhTe = scanner.nextDouble();
        
    }
    @Override  
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Diem kinh te vi mo: " + kinhTeViMo);
        System.out.println("Diem kinh te vix mo: " + kinhTeVixMo);
        System.out.println("Diem luat kinh te: " + luatKinhTe);

    }
    @Override
    public double getDiem() {
        return (kinhTeViMo + kinhTeVixMo + luatKinhTe) / 3;
    }
    

}
