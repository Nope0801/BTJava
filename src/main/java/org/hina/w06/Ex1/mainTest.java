package org.hina.w06.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mainTest {

    public static void main(String[] arg) {
        fraction p1 = new fraction(3, 4);
        fraction p2 = new fraction(5, 6);

        calcFraction calc = new calcFraction(p1, p2);
        // Perform operations
        fraction sum = calc.addFrac();
        fraction difference = calc.subFrac();
        fraction product = calc.mulFrac();
        fraction quotient = calc.divFrac();

        // Print results
        System.out.println("Fraction 1: " + p1);
        System.out.println("Fraction 2: " + p2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        fractionList fracsList = new fractionList();
        fracsList.add(p1, p2);
        System.out.println("Max: " + fracsList.getMax());
        System.out.println("Sum: " + fracsList.sum());
        System.out.println("The number of N: " + fracsList.soKhongPhaiPhanSoNguyen());

        fracsList.sort();
        fracsList.getFracsList().forEach(System.out::println);
    }
}
