package TH1.Bai7;

import java.util.Scanner;

public class CacHamLuongGiac {
    public void nhapGocVaXuatRa(){
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.print("Nhap vao mot goc: ");
        x = sc.nextDouble();
        double a = x*Math.PI/180;
        sc.close(); 
        System.out.println("Sin(" + x + ") = " + Math.sin(a));
        System.out.println("Cos(" + x + ") = " + Math.cos(a));
        System.out.println("Tan(" + x + ") = " + Math.tan(a));
        System.out.println("Cotan(" + x + ") = " + 1/Math.tan(a));
    }  
}
