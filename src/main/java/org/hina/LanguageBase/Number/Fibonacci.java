package org.hina.LanguageBase.Number;

public class Fibonacci {
    public static void main(String[] args) {
        long[] fibo = new long[90];
        fibo[0] = fibo[1] = 1;
        fibo[2] = fibo[0] + fibo[1];

        int m = 1;

        if (m < 1)
            System.out.println("không có số fibo thỏa mãn!");
        else {
            int i = 2;
            while (fibo[i] <= m) {
                fibo[++i] = fibo[i - 1] + fibo[i - 2];
            }

            System.out.println(fibo[i - 1] + " " + fibo[i]);
        }

    }
}
