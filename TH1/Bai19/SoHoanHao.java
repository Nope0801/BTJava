package TH1.Bai19;

import java.util.Scanner;

public class SoHoanHao {
    private int n;
    private float[] day;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = sc.nextInt();
        day = new float[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap so hoan hao thu " + (i+1) + ": ");
            day[i] = sc.nextFloat();
        }
        sc.close();
    }
    public boolean nt(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean kiemTra(float x){
        int temp = 0;
        for(int i = 1; i <= 32;i++){
            if(nt(i)){
                temp = (int)Math.pow(2, i) - 1;
                if(nt(temp)){
                    long hh = 1L*temp*(int)Math.pow(2, i-1);
                    if(hh == x){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public void xuat(){
        for(int i = 0; i < n; i++){
            if(kiemTra(day[i])){
                System.out.print(day[i] + " ");
            }
        }
    }
    
}
