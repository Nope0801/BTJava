package Buoi2.ThaoTacSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int x = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Tong cua " + x + " va " + y + " la " + z);
        sc.close();
    }
}
