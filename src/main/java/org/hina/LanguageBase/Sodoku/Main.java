package org.hina.LanguageBase.Sodoku;

import java.util.Scanner;

public class Main {
    public static void clear() {
        String os = System.getProperty("os.name");

        try {
            if (os.contains("Windows")) {
                // Lệnh clear terminal trên Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Lệnh clear terminal trên Linux hoặc macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        boolean isPlaying = true;
        boolean isLose = false;

        while (isPlaying) {
            System.out.println("========================");
            game.print();
            System.out.println("========================");

            if (game.fill()) {
                if (game.isWin())
                    isPlaying = false;
            } else {
                System.out.println("Game over!");
                isLose = true;
            }


            if (isLose || !isPlaying) {
                System.out.println((isLose)? "You lose!": "You win!");

                System.out.println("press 1 to continue...");
                isLose = false;
                isPlaying = true;


                Scanner scanner = new Scanner(System.in);
                int isStop = scanner.nextInt();

                if (isStop != 1)
                    isPlaying = false;

                game = new Game();
            }

            clear();
        }
        System.out.println("End !");
    }
}
