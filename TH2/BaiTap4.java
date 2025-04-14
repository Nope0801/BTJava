package TH2;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        s = sc.nextLine();
        String tu;
        System.out.println("nhap tu can tim ");
        tu = sc.nextLine();
        if(s.contains(' '+tu+' ')||s.contains(tu+' ')||s.contains(' '+tu)){
            System.out.println("co tu can tim trong chuoi");
        }
        else{
            System.out.println("ko co tu can tim trong chuoi");
        }
    }
}