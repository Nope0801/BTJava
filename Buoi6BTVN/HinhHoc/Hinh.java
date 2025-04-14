package Buoi6BTVN;

abstract class Hinh {
    protected Diem center; 
    public Hinh(Diem center) {
        this.center = center;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public Diem getCenter() { return center; }
    
}