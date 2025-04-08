package org.hina.w06.Ex3.Paint2D;

public class Point2D implements IShape {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D [x = " + x + ", y = " + y + "]";
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(Point2D point2D) {
        return Math.hypot(x - point2D.x, y - point2D.y);
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void rotate(double alpha) {
        return;
    }

    public void zoom(double ratio) {
        return;
    }

    @Override
    public IShape getCenter() {
        return this;
    }

    @Override
    public IShape getBoundary() {
        return this;
    }

    public void rotate(Point2D c, double alpha) {

    }

    public void zoom(Point2D c, double ratio) {
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        this.x += c.x + dx * ratio;
        this.y += c.y + dy * ratio;
    }
}
