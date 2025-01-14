package TH1.Bai9;

import java.util.Scanner;

public class TongChuoiSo {
    private float x;
    private float n;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        this.x = sc.nextFloat();
        System.out.print("Nhap n: ");
        this.n = sc.nextFloat();
        sc.close();
    }
    public float tongChuoiSo(float x, float n){
        float sum = 0;
        float test = 1;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(x, i)/test;
            System.out.println(Math.pow(x, i)+" " + test);
            test *= (test+1);
        }
        return sum;
    }    
    public void xuat(){
        System.out.printf("S(%.3f, %.3f) = %.3f", x, n, tongChuoiSo(x, n));
    }
}
