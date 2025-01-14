package TH1.Bai11;

import java.util.Scanner;

public class HinhThang {
    private float a;
    private float b;
    private float h;
    public HinhThang(){
        this.a = 0;
        this.b = 0;
        this.h = 0;
    }
    public HinhThang(float x, float y, float z){
        this.a = x;
        this.b = y;
        this.h = z;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap a: ");
            this.a = sc.nextFloat();
        }while(a <= 0);
        do{
            System.out.print("Nhap b: ");
            this.b = sc.nextFloat();
        }while(b <= 0);
        do{
            System.out.print("Nhap h: ");
            this.h = sc.nextFloat();
        }while(h <= 0);
        sc.close();
    }
    public float dientich(){
        return (a + b)*h/2;
    }
    public void all(){
        nhap();
        System.out.println("Dien tich cua hinh thang la: " + dientich());
    }
}
