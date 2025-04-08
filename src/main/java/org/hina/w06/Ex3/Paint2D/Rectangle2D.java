package org.hina.w06.Ex3.Paint2D;

public class Rectangle2D implements IShape {

    private Point2D a, b, c, d;

    public Rectangle2D(Point2D a, Point2D b, Point2D c, Point2D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point2D getA() {
        return a;
    }

    public void setA(Point2D a) {
        this.a = a;
    }

    public Point2D getB() {
        return b;
    }

    public void setB(Point2D b) {
        this.b = b;
    }

    public Point2D getC() {
        return c;
    }

    public void setC(Point2D c) {
        this.c = c;
    }

    public Point2D getD() {
        return d;
    }

    public void setD(Point2D d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle2D [c = " + c + ", a = " + a + ", y = " + b + "]";
    }

    @Override
    public double area() {
        return a.distance(b) * a.distance(d);
    }

    @Override
    public double perimeter() {
        return (a.distance(b) + a.distance(d)) * 2;
    }

    @Override
    public double distance() {
        return getCenter().distance();
    }

    @Override
    public void move(double da, double db) {
        this.c.move(da, db);
    }

    @Override
    public void rotate(double alpha) {
        IShape c = this.getCenter();
        c.rotate(alpha);
    }

    @Override
    public void zoom(double ratio) {
        a.zoom((Point2D) getCenter(), ratio);
        b.zoom((Point2D) getCenter(), ratio);
        c.zoom((Point2D) getCenter(), ratio);
        d.zoom((Point2D) getCenter(), ratio);
    }

    @Override
    public IShape getCenter() {
        return new Line2D(a, c).getCenter();
    }

    @Override
    public IShape getBoundary() {
        return this;
    }
}
