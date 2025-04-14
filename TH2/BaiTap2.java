package TH2;

import java.util.Scanner;

public class BaiTap2 {
    public static boolean ktrascp(int a){
        if(a<0){
            return false;
        }
        double tmp=(double)a;
        double sqrt_a = Math.sqrt(tmp);
        return sqrt_a*sqrt_a==tmp;
    }
    public static void main(String[] args) {
        int n, dem=0, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i : a) {
            if(i>=0){
                tong+=i;
                dem++;
            }
        }
        
        if(dem==0){
            System.out.println("mang ko co so am nao!");
        }else{
            float tbc = (float)tong/dem;
            System.out.println("tring binh cong cac phan tu khong am la: "+(tbc) );

        }
        boolean check1=true;
        for (int i : a) {
            if(i%3==0&&i%6!=0){
                if (check1) {
                     System.out.println("cac phan tu chia het cho 3 nhung khong chia het cho 6 la: ");
                    
                }
                check1=false;
                System.out.println(i+" ");
            }
        }
        if (check1) {
            System.out.println("ko co so thoa man");
        }
        System.out.println("cac so chinh phuong la: ");
        for (int i : a) {
            if(ktrascp(i)==true){
                System.out.println(i+" ");
            }
        }
        int x;
        System.out.println("nhap x: ");
        x= sc.nextInt();
        x=x*x;
        boolean check = true;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                if (check) {
                    System.out.println("cac so thoa man la:");
                }
                System.out.println(a[i]+" ");
                check = false;
            }
        }
        if (check) {
            System.out.println("ko co so nao thoa man");
        }
    }
}
