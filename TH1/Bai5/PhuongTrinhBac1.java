package TH1.Bai5;

import java.util.Scanner;

// giai phuong trinh bac 1
public class PhuongTrinhBac1 {
    private float a;
    private float b;
    public PhuongTrinhBac1(){
        this.a = 0;
        this.b = 0;
    }
    public PhuongTrinhBac1(float x, float y){
        this.a = x;
        this.b = y;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        this.a = sc.nextInt();
        System.out.print("Nhap b: ");
        this.b = sc.nextInt();
        sc.close();
    }
    public void giai(){
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            float x = -b/a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }
}
