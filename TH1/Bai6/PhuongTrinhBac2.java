package TH1.Bai6;

import java.util.Scanner;

// giai phuong trinh bac 2
public class PhuongTrinhBac2 {
    private float a;
    private float b;
    private float c;
    public PhuongTrinhBac2(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public PhuongTrinhBac2(float x, float y, float z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        this.a = sc.nextInt();
        System.out.print("Nhap b: ");
        this.b = sc.nextInt();
        System.out.print("Nhap c: ");
        this.c = sc.nextInt();
        sc.close();
    }
    public void giai(){
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                float x = -c/b;
                System.out.println("Nghiem cua phuong trinh la: " + x);
            }
        }else{
            float delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta == 0){
                float x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }else{
                float x1 = (-b + (float)Math.sqrt(delta))/(2*a);
                float x2 = (-b - (float)Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
