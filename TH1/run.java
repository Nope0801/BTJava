package TH1;

import java.util.Scanner;
import TH1.Bai1.Bai1;
import TH1.Bai10.SoGaSoCho;
import TH1.Bai11.HinhThang;
import TH1.Bai12.HinhTron;
import TH1.Bai13.GioPhutGiay;
import TH1.Bai14.SoLeKhongQua100;
import TH1.Bai15.XepLoaiHocSinh;
import TH1.Bai16.KiemTraDayTangGiam;
import TH1.Bai17.BangCuuChuong;
import TH1.Bai18.KiemTraDay;
import TH1.Bai19.SoHoanHao;
import TH1.Bai2.Bai2;
import TH1.Bai3.ThaoTacSo;
import TH1.Bai4.TinhDienTich;
import TH1.Bai5.PhuongTrinhBac1;
import TH1.Bai6.PhuongTrinhBac2;
import TH1.Bai7.CacHamLuongGiac;
import TH1.Bai8.TamGiac;
import TH1.Bai9.TongChuoiSo;

public class run {
    public static void main(String[] args) {
        int choice;
        System.out.println("1. Bai 1");
        System.out.println("2. Bai 2");
        System.out.println("3. Bai 3");
        System.out.println("4. Bai 4");
        System.out.println("5. Bai 5");
        System.out.println("6. Bai 6");
        System.out.println("7. Bai 7");
        System.out.println("8. Bai 8");
        System.out.println("9. Bai 9");
        System.out.println("10. Bai 10");

        System.out.print("Nhap lua chon: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice){
            case 1:
                Bai1 hello = new Bai1();
                hello.hellojava();
                break;
            case 2:
                Bai2 bai2 = new Bai2();
                bai2.lamBai2();
                break;
            case 3:
                ThaoTacSo bai3 = new ThaoTacSo();
                bai3.lamBai3();
            case 4:
                TinhDienTich bai4 = new TinhDienTich();
                bai4.nhap();
                System.out.println("Chu vi: " + bai4.chuvi());
                System.out.println("Dien tich: " + bai4.dientich());
                break;
            case 5:
                PhuongTrinhBac1 bai5 = new PhuongTrinhBac1();
                bai5.nhap();
                bai5.giai();
                break;
            case 6:
                PhuongTrinhBac2 bai6 = new PhuongTrinhBac2();
                bai6.nhap();
                bai6.giai();
                break;
            case 7:
                CacHamLuongGiac bai7 = new CacHamLuongGiac();
                bai7.nhapGocVaXuatRa();
                break;
            case 8:
                TamGiac bai8 = new TamGiac();
                bai8.all();
                break;
            case 9:
                TongChuoiSo bai9 = new TongChuoiSo();
                bai9.nhap();
                bai9.xuat();
                break;
            case 10:
                SoGaSoCho bai10 = new SoGaSoCho();
                bai10.xuat();
                break;
            case 11:
                HinhThang bai11 = new HinhThang();
                bai11.all();
                break;
            case 12:
                HinhTron bai12 = new HinhTron();
                bai12.nhap();
                bai12.xuat();
                break;
            case 13:
                GioPhutGiay bai13 = new GioPhutGiay();
                bai13.xuatThoiGian();
                break;
            case 14:
                SoLeKhongQua100 bai14 = new SoLeKhongQua100();
                bai14.xuat();
                break;
            case 15:
                XepLoaiHocSinh bai15 = new XepLoaiHocSinh();
                bai15.nhap();
                bai15.xepLoai();
                break;
            case 16:
                KiemTraDayTangGiam bai16 = new KiemTraDayTangGiam();
                bai16.nhap();
                bai16.kiemTra();
                break;
            case 17:
                BangCuuChuong bai17 = new BangCuuChuong();
                bai17.xuat();
                bai17.xuatk();
                break;
            case 18:
                KiemTraDay bai18 = new KiemTraDay();
                bai18.nhap();
                bai18.kiemTra();
                break;
            case 19:
                SoHoanHao bai19 = new SoHoanHao();
                bai19.nhap();
                bai19.xuat();
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
        sc.close();
    }
}
