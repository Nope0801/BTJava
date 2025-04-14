package TH2;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        int baitap;
        Scanner sc= new Scanner(System.in);
        do {
           
            System.out.print("\nNhap bai tap muon chay(nhap 0 de thoat): ");
            baitap = sc.nextInt();
            switch (baitap) {
                case 0:
                    break;
                case 1:
                    BaiTap1.main(null);    
                    break;
                case 2:
                    BaiTap2.main(null);    
                    break;
                case 3:
                    BaiTap3.main(null);    
                    break;
                case 4:
                    BaiTap4.main(null);    
                    break;
                case 5:
                    BaiTap5.main(null);    
                    break;
                case 6:
                    BaiTap6.main(null);    
                    break;
                case 7:
                    BaiTap7.main(null);    
                    break;
                
                default:
                System.out.println("So bai tap ko hop le vui long nhap lai");
                    break;
            } 
        } while (baitap!=0);
    }
}
