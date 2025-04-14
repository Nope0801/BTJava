package TH2;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        s = sc.nextLine();
        int cout = 0;
        int size = s.length();
        boolean check=true;
        for(int i=0;i<size;i++){
            if(s.charAt(i)!=' ' && s.charAt(i)!='\n'&&s.charAt(i)!='\t'){
                if(check){
                    cout++;
                    check = false;
                }
                
            }else{
                check = true;
            }
           
        }
        System.out.println(cout);
    }
}
