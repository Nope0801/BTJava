package org.hina.Sudoku.Game;

import org.hina.Sudoku.Controller.PlayerInput;
import org.hina.Sudoku.Exception.ExceptionHandler;

public class GameManager {
    ExceptionHandler exceptionHandler;

    public GameManager() {
        exceptionHandler = new ExceptionHandler();
        play();
    }

    private void play() {
        Game game = new Game();
        PlayerInput input = new PlayerInput(game);
        boolean isPlaying = true;

        while (isPlaying) {
            print(game);
            try {
                input(input, game);
            } catch (Exception e) {
                exceptionHandler.handle(e);
            }

            if (game.isFillAll()) {
                System.out.println(game.isWin() ? "You win!" : "You lose!");
                isPlaying = false;
            }
        }

        input.close();
    }

    private void input(PlayerInput input, Game game) {
        if (input.fillOrAction() == 1) {
            input.fill();
        } else {
            int code = input.code();
            switch (code) {
                case 1 -> game.undo();
                case 2 -> game.redo();
                case 3 -> game.hint();
            }
        }
    }

    private void print(Game game) {
        System.out.println("========================");
        game.print();
        System.out.println("========================");
    }
}
