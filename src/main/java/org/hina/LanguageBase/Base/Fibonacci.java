package org.hina.LanguageBase.Base;

import java.util.Scanner;

public class Fibonacci {
    private static long[] fibonacci() {
        long[] fibo = new long[90];

        fibo[0] = fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo;
    }

    private static int lowerBound(long[] a, long target) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target <= a[mid])
                right = mid;
            else {
                left = mid + 1;
            }
        }
        if (left < a.length && a[left] < target)
            left++;
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var fibo = fibonacci();

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Số fibonacci thứ n là: " + fibo[n]);

        System.out.print("Nhập x: ");
        int x = sc.nextInt();
        System.out.println("Số fibonacci gần với x nhất là: " + fibo[lowerBound(fibo, x)]);

        sc.close();
    }
}
