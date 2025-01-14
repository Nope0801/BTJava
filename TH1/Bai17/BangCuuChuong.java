package TH1.Bai17;

import java.util.Scanner;

public class BangCuuChuong {
    public void xuat(){
        for(int i = 2; i <= 9; i++){
            System.out.println("Bang cuu chuong " + i + ": ");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
    public void xuatk(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so k: ");
        n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

}
