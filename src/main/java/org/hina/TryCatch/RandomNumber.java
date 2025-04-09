package org.hina.TryCatch;

import java.util.*;

public class RandomNumber {
    private final List<Integer> numbers;

    public RandomNumber() {
        final int n = 10;
        Random random = new Random();
        numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt());
        }
    }

    public void get(int n) {
        System.out.println(numbers.get(n));
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            randomNumber.get(n);
        } catch (InputMismatchException e) {
            System.out.println("only integer!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("out of array size");
        }
    }
}
