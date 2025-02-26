package org.hina.LanguageBase.String;


public class Bai1 {
    public static void main(String[] args) {
        String s = "sadubcawoiion".replace("a", "");

        System.out.println(new StringBuilder(s).reverse());
    }
}
