package org.hina.LanguageBase.Number;

public class GiaiHePhuongTrinh {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;

        double dx = -10 * b - 7 * c;
        double dy = a * c + 20.0;
        double d = -a * b - 14;

        if (d == 0){
            if (dx == 0 && dy == 0)
                System.out.println("phương trình vô số nghiệm");
            else
                System.out.println();
        }
    }

}
