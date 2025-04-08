package org.hina.w06.Ex3.Paint2D;

public class Line2D implements IShape {

    private Point2D c1, c2;

    public Line2D(Point2D c1, Point2D c2) {
        super();
        this.c1 = c1;
        this.c2 = c2;
    }

    public Point2D getC1() {
        return c1;
    }

    public void setC1(Point2D c1) {
        this.c1 = c1;
    }

    public Point2D getC2() {
        return c2;
    }

    public void setC2(Point2D c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "Line2D [c1 = " + c1 + ", c2 = " + c2 + "]";
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return distance();
    }

    @Override
    public double distance() {
        return this.c1.distance(c2);
    }

    @Override
    public void move(double dx, double dy) {
        c1.move(dx, dy);
        c2.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        IShape c = this.getCenter();
        c1.rotate((Point2D) c, alpha);
        c2.rotate((Point2D) c, alpha);
    }

    @Override
    public void zoom(double ratio) {
        IShape c = getCenter();
        this.c1.zoom((Point2D) c, ratio);
        this.c2.zoom((Point2D) c, ratio);
    }

    @Override
    public IShape getCenter() {
        double dx = (c1.getX() + c2.getX()) / 2;
        double dy = (c1.getY() + c2.getY()) / 2;

        return new Point2D(dx, dy);
    }

    @Override
    public IShape getBoundary() {
        return this;
    }
}
