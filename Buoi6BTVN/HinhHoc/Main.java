package Buoi6BTVN;

public class Main {
    public static void main(String[] args) {
        // Test HinhTron
        HinhTron ht = new HinhTron(new Diem(0, 0), 5);
        System.out.println("Chu vi: " + ht.tinhChuVi());
        System.out.println("Dien tich: " + ht.tinhDienTich());

        // Test ChuNhat
        ChuNhat cn = new ChuNhat(4, 3); // Không cần center
        System.out.println(cn);
        System.out.println("Chu vi: " + cn.tinhChuVi());
        System.out.println("Dien tich: " + cn.tinhDienTich());

        // Test TamGiac
        TamGiac tg = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4)); // Không cần center
        System.out.println("Chu vi: " + tg.tinhChuVi());
        System.out.println("Dien tich: " + tg.tinhDienTich());
    }
}