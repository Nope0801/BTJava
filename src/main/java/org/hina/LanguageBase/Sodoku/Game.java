package org.hina.LanguageBase.Sodoku;

import java.util.Scanner;

public class Game {
    private final FilterMap filterMap;

    public Game() {
        filterMap = new FilterMap();
    }

    public boolean fill (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dòng thứ: ");
        int i = scanner.nextInt();

        System.out.print("Cột thứ: ");
        int j = scanner.nextInt();

        System.out.print("Số: ");
        byte x = scanner.nextByte();

        return filterMap.fill(x, i - 1, j - 1);
    }

    public void print (){
        filterMap.print();
    }

    public boolean isWin(){
        return filterMap.isWin();
    }
}
