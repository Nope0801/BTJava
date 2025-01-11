package org.hina.LanguageBase.String;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replace("a", "");

        System.out.println(new StringBuilder(s).reverse());

        scanner.close();
    }
}
