package org.hina.w06.Ex3.Paint2D;

public class Triangle2D implements IShape {
    private Point2D a, b, c;

    public Triangle2D(Point2D a, Point2D b, Point2D c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point2D getA() {
        return a;
    }

    public Point2D getB() {
        return b;
    }

    public Point2D getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle2D [, a = " + a + ", b = " + b + ", c = " + c + "]";
    }

    @Override
    public double perimeter() {
        return a.distance(b) + a.distance(c) + b.distance(c);
    }

    @Override
    public double area() {
        return this.getBoundary().area();
    }

    @Override
    public double distance() {
        return this.getCenter().distance();
    }

    @Override
    public void move(double dx, double dy) {
        a.move(dx, dy);
        b.move(dx, dy);
        c.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        IShape center = getCenter();
        a.rotate((Point2D) center, alpha);
        b.rotate((Point2D) center, alpha);
        c.rotate((Point2D) center, alpha);
    }

    @Override
    public void zoom(double ratio) {
        IShape center = getCenter();
        a.zoom((Point2D) center, ratio);
        b.zoom((Point2D) center, ratio);
        c.zoom((Point2D) center, ratio);
    }

    @Override
    public IShape getCenter() {
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point2D(centroidX, centroidY);
    }

    @Override
    public IShape getBoundary() {
        double xMin = Math.min(a.getX(), Math.min(b.getX(), c.getX()));
        double yMin = Math.min(a.getY(), Math.min(b.getY(), c.getY()));
        double xMax = Math.max(a.getX(), Math.max(b.getX(), c.getX()));
        double yMax = Math.max(a.getY(), Math.max(b.getY(), c.getY()));

//        return new Rectangle2D(xMin, yMin, xMax, yMax);
        return null;
    }
}
