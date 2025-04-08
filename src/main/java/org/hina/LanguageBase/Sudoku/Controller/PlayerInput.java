package org.hina.LanguageBase.Sudoku.Controller;

import org.hina.LanguageBase.Sudoku.Game.Game;

import java.util.Scanner;

public class PlayerInput {
    private final Scanner scanner;
    private final Game game;

    public PlayerInput(Game game) {
        this.scanner = new Scanner(System.in);
        this.game = game;
    }

    public void fill() {
        System.out.print("Dòng thứ: ");
        int i = scanner.nextInt();
        System.out.print("Cột thứ: ");
        int j = scanner.nextInt();
        System.out.print("Số: ");
        byte x = scanner.nextByte();

        game.fill(i - 1, j - 1, x);
    }

    public void close() {
        scanner.close();
    }
}
