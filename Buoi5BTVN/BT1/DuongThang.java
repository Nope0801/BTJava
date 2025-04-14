package Buoi5BTVN.BT1;

public class DuongThang extends Diem{
    private Diem A;
    private Diem B;

    public DuongThang() {
        this.A = new Diem();
        this.B = new Diem();
    }

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public Diem getA() {
        return A;
    }
    public Diem getB() {
        return B;
    }

    public void setA(Diem A) {
        this.A = A;
    }
    public void setB(Diem B) {
        this.B = B;
    }
    public Double tinhDoDai() {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }
}
