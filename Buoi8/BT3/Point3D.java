package Buoi8.BT3;

class Point3D extends Point2D {
    private double z; 

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void hienThi() {
        System.out.printf("Toa do 3D: (%.2f, %.2f, %.2f)\n", x, y, z);
    }
    @Override
    public double khoangCachDenGoc() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    public double khoangCach(Point3D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public Point3D doiXungQuaGoc() {
        return new Point3D(-x, -y, -z);
    }
}
