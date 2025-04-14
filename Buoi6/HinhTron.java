package Buoi6;



public class HinhTron extends Hinh{
    // private double r, x, y;
    // public HinhTron(){}
    // public double getR() {
    //     return r;
    // }
    // public double getX() {
    //     return x;
    // }
    // public double getY() {
    //     return y;
    // }
    // public void setR(double r) {
    //     this.r = r;
    // }
    // public void setX(double x) {
    //     this.x = x;
    // }
    // public void setY(double y) {
    //     this.y = y;
    // }
    // public double tinhChuVi(){
    //     return 2*Math.PI*r;
    // }
    // public double tinhDienTich(){
    //     return Math.PI*r*r;
    // }
    public double r;

    public double getR() {
        return r;
    }

    public HinhTron(double x, double y, double r){
        super(x, y);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override  
    public double tinhDienTich(){
        return Math.PI*r*r;
    }
    @Override
    public double tinhChuVi(){
        return 2*Math.PI*r;
    }
}
