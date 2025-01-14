package TH1.Bai16;

import java.util.Scanner;

public class KiemTraDayTangGiam {
    private int[] day;
    private int n;
    public KiemTraDayTangGiam(){
        this.n = 0;
    }
    public KiemTraDayTangGiam(int n){
        this.n = n;
        day = new int[n];
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            day[i] = sc.nextInt();
        }
        sc.close();
    }
    public void kiemTra(){
        boolean tang = true;
        boolean giam = true;
        for(int i = 0; i < n-1; i++){
            if(day[i] > day[i+1]){
                tang = false;
                break;
            }
            if(day[i] < day[i+1]){
                giam = false;
                break;
            }
        }
        if(tang){
            System.out.println("Day so la day tang");
        }else if(giam){
            System.out.println("Day so la day giam");
        }else{
            System.out.println("Day so khong tang cung khong giam");
        }
    }
}
