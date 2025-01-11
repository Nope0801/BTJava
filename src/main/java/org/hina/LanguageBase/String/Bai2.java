package org.hina.LanguageBase.String;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();

        int res = 0;
        for (var x: s)
            if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
                res++;

        if (res > 0)
            System.out.println("trong chuỗi có " + res);
        else
            System.out.println("không có mảng nào trong chuỗi");
    }
}
