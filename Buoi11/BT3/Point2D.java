package Buoi11.BT3;

class Point2D {
    protected double x; 
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void hienThi() {
        System.out.printf("Toa do 2D: (%.2f, %.2f)\n", x, y);
    }

    public double khoangCachDenGoc() {
        return Math.sqrt(x * x + y * y);
    }

    public double khoangCach(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point2D doiXungQuaGoc() {
        return new Point2D(-x, -y);
    }
}