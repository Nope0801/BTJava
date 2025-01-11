package org.hina.LanguageBase.Base;

import java.util.Scanner;

public class TinhS {
    private static long[] giaiThua (){
        long[] gt = new long[90];

        gt[0] = gt[1] = 1;
        for (int i = 2; i < gt.length; i++) {
            gt[i] = gt[i - 1] * i;
        }

        return  gt;
    }

    private static double chinhHop (long[] gt, int x, int n){
        return (double) gt[n] / gt[n - x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập n: ");
        int n = scanner.nextInt();

        System.out.print("nhập x: ");
        int x = scanner.nextInt();

        long[] gt = giaiThua();

        double res = 0;

        for (int i = 0; i <= n; i++) {
            res += chinhHop(gt, i, n) * Math.pow(x, i) / gt[i];
            System.out.println(chinhHop(gt, i, n) * Math.pow(x, i) / gt[i]);
        }

        System.out.println("S = " + res);

        scanner.close();
    }
}
