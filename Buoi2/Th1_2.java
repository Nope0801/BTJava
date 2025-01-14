package Buoi2;

import java.util.Scanner;

public class Th1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        long x = sc.nextInt();
        long y = (long)Math.pow(2, x);
        System.out.println("2^x = " + y);
        sc.close();
    }

}
