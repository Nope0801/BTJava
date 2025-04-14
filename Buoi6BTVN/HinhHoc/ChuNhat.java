package Buoi6BTVN;

class ChuNhat extends Hinh {
    private double dai;
    private double rong;

    public ChuNhat(double dai, double rong) {
        super(null); // Truyền null cho center vì không dùng
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (dai + rong);
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat voi chieu dai " + dai + " va chieu rong " + rong;
    }
}