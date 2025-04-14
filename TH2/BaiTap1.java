package TH2;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        float a[]= new float[5];
        System.out.println("nhap 5 phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i] = sc.nextFloat();
        }
        Arrays.sort(a);
        System.out.println("mang sau khi xap la: ");
        for (float x: a) {
            System.out.println(x+" ");
        }
        System.out.println("phan tu nho nhat la: "+a[0]);
        System.out.println("phan tu nho nhat la: "+a[4]);

    }
}
