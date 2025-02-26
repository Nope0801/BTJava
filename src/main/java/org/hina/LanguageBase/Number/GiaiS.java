package org.hina.LanguageBase.Number;

public class GiaiS {
    private static long[] gt = new long[90];

    private static void gt(int n) {
        gt[0] = gt[1] = 1;
        for (int i = 2; i < Math.min(gt.length, n + 5); i++) {
            gt[i] = gt[i - 1] * i;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        gt(n);

        double s = 0;
        for (int i = 1; i <= n; i++) {
            double temp = Math.sqrt(i);

            s += (i + temp) / (i + gt[i + 1]);
        }

        System.out.println(s);
    }
}
