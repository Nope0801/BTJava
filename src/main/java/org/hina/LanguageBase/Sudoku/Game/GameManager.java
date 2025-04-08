package org.hina.LanguageBase.Sudoku.Game;

import org.hina.LanguageBase.Sudoku.Controller.PlayerInput;
import org.hina.LanguageBase.Sudoku.Exception.ExceptionHandler;

public class GameManager {
    ExceptionHandler exceptionHandler = new ExceptionHandler();

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
                inputUpdate(input);
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

    private void inputUpdate(PlayerInput input) {
        input.fill();
    }

    private void print(Game game) {
        System.out.println("========================");
        game.print();
        System.out.println("========================");
    }
}
