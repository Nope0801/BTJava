package TH1.Bai4;

import java.util.Scanner;

public class TinhDienTich {
    private float canh1;
    private float canh2;
    public TinhDienTich(){
        this.canh1 = 0;
        this.canh2 = 0;
    }
    public TinhDienTich(float x, float y){
        this.canh1 = x;
        this.canh2 = y;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh1: ");
        this.canh1 = sc.nextInt();
        System.out.print("Nhap canh2: ");
        this.canh2 = sc.nextInt();
        sc.close();
    }
    public float chuvi(){
        float chu_vi = (canh1 + canh2)*2;
        return chu_vi;
    }
    public float dientich(){
        float dien_tich = canh1*canh2;
        return dien_tich;
    }
}
