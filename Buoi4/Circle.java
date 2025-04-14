package Buoi4;

public class Circle {
    private double r;
    private double x;
    private double y;

    public Circle(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.println("Ban kinh: " + r + " Toa do x: " + x + " Toa do y: " + y);
    }

    public double chuVi() {
        return 2 * Math.PI * r;
    }

    public double dienTich() {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5, 0, 0);
        c.print();

    }
}
