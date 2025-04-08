package org.hina.w06.Ex3.Paint2D;

public class Square2D extends Rectangle2D {
    public Square2D(Point2D a, Point2D c) {
        super(a, new Point2D(c.getX(), a.getY()), c, new Point2D(a.getX(), c.getY()));
    }
}
