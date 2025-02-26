package org.hina.LanguageBase.Number;

public class Tinh {
    public static void main(String[] args) {
        int s = 0;
        int[] a = {1,2,3,4,5,6,7,8,9,0};

        for (var x: a)
            s += (x % 3 == 0)? x: 0;

        System.out.println(s);
    }
}
