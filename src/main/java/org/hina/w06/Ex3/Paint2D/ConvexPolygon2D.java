package org.hina.w06.Ex3.Paint2D;

import java.util.List;

public class ConvexPolygon2D implements IShapeO, IShapeT {
    private final List<Point2D> polygon;

    public ConvexPolygon2D(List<Point2D> polygon) {
        this.polygon = polygon;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double distance() {
        double s = distanceBetween2Point(0, polygon.size() - 1);
        for (int i = 1; i < polygon.size(); i++) {
            s += distanceBetween2Point(i, i - 1);
        }

        return s;
    }

    private double distanceBetween2Point(int i, int j) {
        Point2D p1 = polygon.get(i);
        Point2D p2 = polygon.get(j);

        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public void move(double dx, double dy) {

    }

    public void rotate(double alpha) {

    }

    public void zoom(double ratio) {

    }
}
