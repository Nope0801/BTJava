package Buoi6;

public class TamGiac extends Hinh{ 
    // private double a, b, c;
    // public TamGiac(){}
    // public double getA() {
    //     return a;
    // }
    // public double getB() {
    //     return b;
    // }
    // public double getC() {
    //     return c;
    // }
    // public void setA(double a) {
    //     this.a = a;
    // }
    // public void setB(double b) {
    //     this.b = b;
    // }
    // public void setC(double c) {
    //     this.c = c;
    // }
    // public double tinhChuVi(){
    //     return a + b + c;
    // }
    // public double tinhDienTich(){
    //     double p = tinhChuVi()/2;
    //     return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    // }
    private double c;
    public double getC() {
        return c;
    }
    public TamGiac(double x, double y, double c){
        super(x, y);
        this.c = c;
    }
    public void setC(double c) {
        this.c = c;
    }
    @Override
    public double tinhChuVi(){
        return getC() + getX() + getY();
    }
    @Override
    public double tinhDienTich(){
        double p = this.tinhChuVi()/2;
        return Math.sqrt((p-getX())*(p-getY())*(p-getC()));
    }   


}
