package TH1.Bai8;

import java.util.Scanner;

public class TamGiac {
    private float a;
    private float b;
    private float c;
    public TamGiac(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public TamGiac(float x, float y, float z){
        this.a = x;
        this.b = y;
        this.c = z;
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
            System.out.print("Nhap c: ");
            this.c = sc.nextFloat();
        }while(c <= 0);
        sc.close();
    }
    public boolean kiemTra(){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        return false;
    }
    public float chuvi(){
        return a + b + c;
    }
    public float dientich(){
        float p = chuvi()/2;
        return (float)Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    public void all(){
        nhap();
        if(kiemTra()){
            System.out.println("Chu vi cua tam giac la: " + chuvi());
            System.out.println("Dien tich cua tam giac la: " + dientich());
        }else{
            System.out.println("Khong tao thanh tam giac");
        }
    }


}
