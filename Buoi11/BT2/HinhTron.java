package Buoi11.BT2;

class HinhTron {
    private Diem center;
    private double banKinh;

    public HinhTron(Diem center, double banKinh) {
        this.center = center;
        this.banKinh = banKinh;
    }
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

}