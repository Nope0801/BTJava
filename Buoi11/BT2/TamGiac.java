package Buoi11.BT2;

class TamGiac {
    private Diem A;
    private Diem B;
    private Diem C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    private double khoangCach(Diem d1, Diem d2) {
        return Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + 
                        Math.pow(d2.getY() - d1.getY(), 2));
    }
    public double tinhChuVi() {
        double canh1 = khoangCach(A, B);
        double canh2 = khoangCach(B, C);
        double canh3 = khoangCach(C, A);
        return canh1 + canh2 + canh3;
    }

    public double tinhDienTich() {
        double a = khoangCach(A, B);
        double b = khoangCach(B, C);
        double c = khoangCach(C, A);
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}