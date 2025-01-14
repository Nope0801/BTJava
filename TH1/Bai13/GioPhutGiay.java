package TH1.Bai13;

import java.util.Scanner;

public class GioPhutGiay {
    public void xuatThoiGian(){
        Scanner sc = new Scanner(System.in);
        int giay;
        System.out.print("Nhap vao so giay: ");
        giay = sc.nextInt();
        int gio = giay/3600;
        int phut = (giay%3600)/60;
        int giay_con_lai = (giay%3600)%60;
        System.out.println((gio<10?"0"+gio:gio) + ":" + (phut<10?"0"+phut:phut)+ ":" + giay_con_lai);
        sc.close();
    }    
}
