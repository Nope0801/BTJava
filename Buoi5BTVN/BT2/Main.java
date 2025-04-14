package Buoi5BTVN.BT2;

public class Main {
    public static void main(String[] args) {
        TamGiac tamGiac1 = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4));
        TamGiac tamGiac2 = new TamGiac(new Diem(1, 1), new Diem(4, 1), new Diem(2, 5));
        ChuNhat chuNhat1 = new ChuNhat(4, 3);
        ChuNhat chuNhat2 = new ChuNhat(5, 2);
        HinhTron hinhTron1 = new HinhTron(new Diem(0, 0), 5);
        HinhTron hinhTron2 = new HinhTron(new Diem(2, 3), 3);

        System.out.println("=== Tam Giac ===");
        System.out.println("Chu vi: " + tamGiac1.tinhChuVi());
        System.out.println("Dien tich: " + tamGiac1.tinhDienTich());
        System.out.println("Chu vi: " + tamGiac2.tinhChuVi());
        System.out.println("Dien tich: " + tamGiac2.tinhDienTich());

        System.out.println("\n=== Chu Nhat ===");
        System.out.println("Chu vi: " + chuNhat1.tinhChuVi());
        System.out.println("Dien tich: " + chuNhat1.tinhDienTich());
        System.out.println("Chu vi: " + chuNhat2.tinhChuVi());
        System.out.println("Dien tich: " + chuNhat2.tinhDienTich());

        System.out.println("\n=== Hinh Tron ===");
        System.out.println("Chu vi: " + hinhTron1.tinhChuVi());
        System.out.println("Dien tich: " + hinhTron1.tinhDienTich());
        System.out.println("Chu vi: " + hinhTron2.tinhChuVi());
        System.out.println("Dien tich: " + hinhTron2.tinhDienTich());
    }
}