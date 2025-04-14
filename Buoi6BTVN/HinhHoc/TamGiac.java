package Buoi6BTVN;

class TamGiac extends Hinh {
    private Diem diemA;
    private Diem diemB;
    private Diem diemC;

    public TamGiac(Diem diemA, Diem diemB, Diem diemC) {
        super(null); // Truyền null cho center vì không dùng
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    // Tính khoảng cách giữa 2 điểm
    private double khoangCach(Diem d1, Diem d2) {
        return Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + 
                        Math.pow(d2.getY() - d1.getY(), 2));
    }

    @Override
    public double tinhChuVi() {
        double canh1 = khoangCach(diemA, diemB);
        double canh2 = khoangCach(diemB, diemC);
        double canh3 = khoangCach(diemC, diemA);
        return canh1 + canh2 + canh3;
    }

    @Override
    public double tinhDienTich() {
        // Công thức Heron
        double a = khoangCach(diemA, diemB);
        double b = khoangCach(diemB, diemC);
        double c = khoangCach(diemC, diemA);
        double s = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Tam giac voi 3 dinh: " + diemA + ", " + diemB + ", " + diemC;
    }
}