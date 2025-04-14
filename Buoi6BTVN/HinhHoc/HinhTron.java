package Buoi6BTVN;

public class HinhTron extends Hinh{
    private double banKinh;
    public HinhTron(Diem center, double banKinh) {
        super(center);
        this.banKinh = banKinh;
    }
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    
}
