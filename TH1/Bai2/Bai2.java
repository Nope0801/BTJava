package TH1.Bai2;

import java.util.Scanner;

public class Bai2 {
    public void lamBai2(){
        float x;
        System.out.print("Nhap x: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        float y = (float) (Math.pow(x, 2));
        System.out.println("y = "+ x + "^2 = " + y);
        sc.close();
    }    
}
