package Buoi5;

import java.util.Scanner;
 
public class SinhVien {
    private String hoTen, diaChi, gioiTinh;
    private double diem;
    public SinhVien(){}
    public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem = diem;
    }    
    public SinhVien(String hoTen, double diem, String gioiTinh){
        this(hoTen, diem);
        this.gioiTinh = gioiTinh;
    }
    public SinhVien(String hoTen, double diem, String gioiTinh, String diaChi){
        this(hoTen, diem, gioiTinh);
        this.diaChi = diaChi;
    }

    public String getHoTen(){
        return this.hoTen;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public String getGioiTinh(){
        return this.gioiTinh;
    }
    public double getDiem(){
        return this.diem;
    }
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public void setDiem(double diem){
        this.diem = diem;
    }


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Ten: ");
            hoTen = sc.nextLine();
            if(hoTen.matches("[a-zA-Z ]+")){
                break;
            }
            else{
                System.out.println("Ho ten chi duoc chua cac ky tu tu a -> z.");
            }
        }
        while (true) { 
            System.out.print("Dia chi: ");
            diaChi = sc.nextLine();
            if(diaChi.matches("[a-zA-Z0-9,/ ]+")){
                break;
            }
            else{
                System.out.println("Ho ten chi duoc chua cac ky tu tu a -> z, so, va ky tu /.");
            }
        }
        while(true){
            System.out.print("Gioi tinh(Nam/Nu/Khac): ");
            gioiTinh = sc.nextLine();
            if(gioiTinh.equals("Nam")||gioiTinh.equals("Nu")||gioiTinh.equals("Khac") ){
                break;
            }
            else{
                System.out.println("Gioi tinh khong hop le!");
            }
        }

        while(true){
            System.out.print("Diem: ");
            if(sc.hasNextDouble()){
                diem = sc.nextDouble();
                if(diem >= 0 && diem <= 10){
                    break;
                }
                else{
                    System.out.println("Diem phai nam trong khoang tu 0 den 10.");
                }
            }
            else{
                System.err.println("Vui long nhap mot so.");
                sc.next();
            }
        }
        sc.close();
    }
    public void xuat(){
       System.out.printf("|%12s|%15s|%12s|%12f|", hoTen, diaChi, gioiTinh, diem);    
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
    }
    
}
