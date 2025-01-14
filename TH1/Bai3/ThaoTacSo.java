package TH1.Bai3;

import java.util.Scanner;

public class ThaoTacSo {
    public void lamBai3(){
        float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So thu nhat: ");
        x = sc.nextFloat();
        System.out.print("Nhap So thu hai: ");
        y = sc.nextFloat();
        System.out.println("Tong cua " + x + "Va" + y + (x + y));
        sc.close();
    }
}
