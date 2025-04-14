package TH2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        ArrayList<Integer> chan=new ArrayList<>();
        ArrayList<Integer> le=new ArrayList<>();
        for (String string : arr) {
            int tmp = Integer.parseInt(string);
            if(tmp%2==0){
                chan.add(tmp);
            }else{
                le.add(tmp);
            }
        }
        Collections.sort(chan);
        Collections.sort(le);
        for (Integer integer : chan) {
            System.out.print(integer+" ");
        }
        for(int i=le.size()-1;i>=0;i--){
            System.out.print(le.get(i)+" ");
        }
        
    }
}
