package TH1.Bai15;

import java.util.Scanner;

public class XepLoaiHocSinh {
    private float diem;
    public XepLoaiHocSinh(){
        this.diem = 0;
    }
    public void nhap(){
        System.out.print("Nhap diem: ");
        Scanner sc = new Scanner(System.in);
        this.diem = sc.nextFloat();
        sc.close();
    }
    public void xepLoai() {
        if (diem < 0 || diem > 10) {
            System.out.println("Diem khong hop le. Diem phai >= 0 va <= 10.");
        } else if (diem < 5) {
            System.out.println("Hoc luc Yeu");
        } else if (diem < 6) {
            System.out.println("Hoc luc Trung binh");
        } else if (diem < 7) {
            System.out.println("Hoc luc Trung binh kha");
        } else if (diem < 8) {
            System.out.println("Hoc luc Kha");
        } else if (diem < 9) {
            System.out.println("Hoc luc Gioi");
        } else {
            System.out.println("Hoc luc Xuat sac");
        }
    }

}
