import java.util.ArrayList;
import java.util.Scanner;
class SinhVien2{
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    public SinhVien2(){};
    public SinhVien2(String maSV,String hoTen,String ngaySinh,String gioiTinh){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: "); maSV = sc.nextLine();
        System.out.print("Nhap ten SV: "); hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh (DD/MM/YYYY): "); ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gioiTinh = sc.nextLine();

    }
    public void hienThiThongTin(){
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
    }


}

class svCNTT extends SinhVien2{
    private double diemCTDL_GT,diemTRR,diemCSDL,diemOOP;
    public svCNTT(){}
    public svCNTT(String maSV,String hoTen,String ngaySinh,String gioiTinh,double diemCTDL_GT,double diemTRR,double diemCSDL,double diemOOP){
        super(maSV,hoTen,ngaySinh,gioiTinh);
        this.diemCTDL_GT = diemCTDL_GT;
        this.diemTRR = diemTRR;
        this.diemCSDL = diemCSDL;
        this.diemOOP = diemOOP;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap diem CTDL_GT: "); diemCTDL_GT = sc.nextFloat();
        System.out.print("Nhap diem TRR: "); diemTRR = sc.nextFloat();
        System.out.print("Nhap diem CSDL: "); diemCSDL = sc.nextFloat();
        System.out.print("Nhap diem OOP: "); diemOOP = sc.nextFloat();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Diem TB: " + tinhdiemTB());
        System.out.println("Xep loai: " + xepLoaiHocTap());
    }
    public double tinhdiemTB(){
        return (diemCTDL_GT + diemTRR + diemCSDL + diemOOP) / 4;
    }
    public String xepLoaiHocTap() {
        double diemTB = tinhdiemTB();
        if (diemTB >= 8.5) return "Gioi";
        else if (diemTB >= 7) return "Kha";
        else if (diemTB >= 5) return "Trung binh";
        else return "Yeu";
    }
    
}
class svKinhTe extends SinhVien2{
    public svKinhTe(){}
    private double diemViMo,diemVi_Mo,diemLKT;
    public svKinhTe(String maSV,String hoTen,String ngaySinh,String gioiTinh,double diemViMo,double diemVi_Mo,double diemLKT){
        super(maSV,hoTen,ngaySinh,gioiTinh);
        this.diemViMo = diemViMo;
        this.diemVi_Mo = diemVi_Mo;
        this.diemLKT = diemLKT;
    }
    public double tinhdiemTB(){
        return (diemViMo + diemVi_Mo + diemLKT) / 3;
    }
    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap diem Vi Mo: "); diemViMo = sc.nextFloat();
        System.out.print("Nhap diem Vi~ Mo: "); diemVi_Mo = sc.nextFloat();
        System.out.print("Nhap diem Luat Kinh Te: "); diemLKT = sc.nextFloat();
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Diem TB: " + tinhdiemTB());
        System.out.println("Xep loai: " + xepLoaiHocTap());
    }
    public String xepLoaiHocTap() {
        double diemTB = tinhdiemTB();
        if (diemTB >= 8.5) return "Gioi";
        else if (diemTB >= 7) return "Kha";
        else if (diemTB >= 5) return "Trung binh";
        else return "Yeu";
    }

}

public class DaHinhSinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien2> danhSachSV = new ArrayList<>();
        
        System.out.print("Nhap so luong Sinh Vien: ");
        int soluongSV = sc.nextInt();
        int khoa = sc.nextInt();

        switch (khoa) {
            case 1:
                for(int i=1;i<=soluongSV;i++){
                    
                }        

            case 2:            

            default:
                
        }
        
        
        System.out.println("\nDanh sach sinh vien da nhap:");
        for (SinhVien2 sv : danhSachSV) {
            sv.hienThiThongTin();
            System.out.println("-------------------------");
        }
        
        sc.close();
    }
}
// Can xu ly thong tin cua 2 khoa sinh vien khac nhau
// Su dung switch-case va while
// Khuyen khich su dung ham dong goi
// Can trinh bay thong tin dau ra de nhin hon
