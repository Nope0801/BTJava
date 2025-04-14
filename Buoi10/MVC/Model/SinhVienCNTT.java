package MVC.Model;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien{
    private double CSDL_GT;
    private double TRR;
    private double CSDL;
    private double OOP;
    public SinhVienCNTT(){
        super();
        this.CSDL_GT = 0.0;
        this.TRR = 0.0;
        this.CSDL = 0.0;
        this.OOP = 0.0;
    };
    public SinhVienCNTT(String ma, String hoTen, String ngaySinh, String gioiTinh, double diemDaiCuong, double diemChuyenTri, double diemPhapLuat, double CSDL_GT, double TRR, double CSDL, double OOP){
        super(ma, hoTen, ngaySinh, gioiTinh, diemDaiCuong, diemChuyenTri, diemPhapLuat);
        this.CSDL_GT = CSDL_GT;
        this.TRR = TRR;
        this.CSDL = CSDL;
        this.OOP = OOP;
    }
    @Override
    public void nhapThongTin(){
        try (Scanner scanner = new Scanner(System.in)) {
            super.nhapThongTin();
            System.out.print("Nhap diem CSDL_GT: ");this.CSDL_GT = scanner.nextDouble();
            System.out.print("Nhap diem TRR: ");this.TRR = scanner.nextDouble();
            System.out.print("Nhap diem CSDL: ");this.CSDL = scanner.nextDouble();
            System.out.print("Nhap diem OOP: ");this.OOP = scanner.nextDouble();
        }
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Diem CSDL_GT: " + CSDL_GT);
        System.out.println("Diem TRR: " + TRR);
        System.out.println("Diem CSDL: " + CSDL);
        System.out.println("Diem OOP: " + OOP);
        
    }
    


}
