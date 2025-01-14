package Buoi2.TinhDienTich;

import java.util.Scanner;

public class Hinh {
    private int canh1, canh2;
    Hinh(){}
    public Hinh(int canh1, int canh2){
        this.canh1 = canh1;
        this.canh2 = canh2;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh1: ");
        this.canh1 = sc.nextInt();
        System.out.print("Nhap canh2: ");
        this.canh2 = sc.nextInt();
        sc.close();
    }
    public int chuvi(){
        int chu_vi = (canh1 + canh2)*2;
        return chu_vi;
    }
    public int dientich(){
        int dien_tich = canh1*canh2;
        return dien_tich;
    }
}
