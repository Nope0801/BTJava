package TH2;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random() * (90 - 10 + 1) + 10);
        }
        ArrayList<Integer> b=new ArrayList<>();
        int i=0;
        for(int x:a){
            int tmp = x%10;
            if(tmp==2||tmp==4||tmp==6){
                b.add(x);
                i++;
            }
        }
        for (int t : b) {
            System.out.println(t+" ");
        }
    }
}
