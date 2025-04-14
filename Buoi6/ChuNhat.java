package Buoi6;

public class ChuNhat extends Hinh {
    // private double dai, rong;
    // public ChuNhat(){}
    // public double getDai() {
    //     return dai;
    // }
    // public double getRong() {
    //     return rong;
    // }
    // public void setDai(double dai) {
    //     this.dai = dai;
    // }
    // public void setRong(double rong) {
    //     this.rong = rong;
    // }
    // public double tinhChuVi(){
    //     return (dai + rong) * 2;
    // }
    // public double tinhDienTich(){
    //     return dai * rong;
    // }
    @Override
    public void nhap(){
        super.nhap();
    }
    public ChuNhat(double x, double y){
        super();
    }
    @Override
    public double tinhChuVi(){
        return 2*(getX() + getY());
    }
    @Override
    public double tinhDienTich(){
        return getX()*getY();
    }

}
