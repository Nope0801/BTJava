package Buoi2.PhuongTrinhBac1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        if(a == 0 && b == 0 ){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(a == 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(b == 0){
            System.out.println("Phuong trinh co mot nghiem duy nhat la 0");
        }
        else{
            float c = (float)-b/(float)a;
            System.out.println("PT co nghiem "+ c);
        }
        sc.close();
    }    
}
