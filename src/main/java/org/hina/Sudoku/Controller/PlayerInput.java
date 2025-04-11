package org.hina.Sudoku.Controller;

import org.hina.Sudoku.Exception.IllegalInputException;
import org.hina.Sudoku.Game.Game;

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

    public int code() {
        System.out.println("next: 0");
        System.out.println("undo: 1");
        System.out.println("redo: 2");
        System.out.println("hint: 3");
        int code = scanner.nextInt();
        if (code < 0 || code > 3)
            throw new IllegalInputException("không tồn tại hành động.");
        return code;
    }

    public int fillOrAction() {
        System.out.println("fill: 1");
        System.out.println("action: 2");
        int code = scanner.nextInt();
        if (code < 1 || code > 2)
            throw new IllegalInputException("không tồn tại hành động.");
        return code;
    }

    public void close() {
        scanner.close();
    }
}
