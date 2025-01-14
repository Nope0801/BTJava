package TH1.Bai18;

import java.util.Scanner;

//Viết chương trình nhập dãy số thực có n phần tử và một số x. Dò xem trong dãy có hai phần tử liền nhau nào mà tổng của chúng bằng x không? 
public class KiemTraDay {
    private int n;
    private float[] x;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = sc.nextInt();
        x = new float[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap x["+i+"]: ");
            x[i] = sc.nextFloat();
        }
        sc.close();
    }
    public void kiemTra(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        float k = sc.nextFloat();
        sc.close();
        for(int i = 0; i < n - 1; i++){
            if(this.x[i] + this.x[i+1] == k){
                System.out.println("Hai phan tu lien nhau co tong bang " + x + " la: " + this.x[i] + " va " + this.x[i+1]);
            }
        }
    }
}
