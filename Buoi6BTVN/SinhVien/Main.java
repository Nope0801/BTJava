package Buoi6BTVN.SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVienCNTT svCNTT1 = new SinhVienCNTT();
        svCNTT1.nhapThongTin();
        SinhVienCNTT svCNTT2 = new SinhVienCNTT();
        svCNTT2.nhapThongTin();

        SinhVienKinhTe svKinhTe1 = new SinhVienKinhTe();
        svKinhTe1.nhapThongTin();
        SinhVienKinhTe svKinhTe2 = new SinhVienKinhTe();
        svKinhTe2.nhapThongTin();
        
        System.out.println("\n=== Thong tin sinh vien CNTT ===");
        svCNTT1.hienThiThongTin();
        svCNTT2.hienThiThongTin();

        System.out.println("\n=== Thong tin sinh vien Kinh te ===");
        svKinhTe1.hienThiThongTin();
        svKinhTe2.hienThiThongTin();
    }
}
