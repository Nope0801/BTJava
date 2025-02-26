package org.hina.LanguageBase.BatTheShip;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BatTheShip {
    private final int[][] map;
    private int nf;
    private int nb = 10;
    private final int delta = 1;

    public BatTheShip() {
        this.map = new int[10][10];
        for (int[] ints : map) {
            Arrays.fill(ints, -2);
        }

        int cnt = 0;
        Random random = new Random();
        while (cnt < nb){
            int i = random.nextInt(map.length);
            int j = random.nextInt(map[i].length);
            if (map[i][j] != -1){
                map[i][j] = -1;
                cnt++;
            }
        }

        nf = nb + 10;
    }

    private void show(boolean isCheat) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if ((map[i][j] == -1 || map[i][j] == -2) && !isCheat) {
                    System.out.print("*");
                } else {
                    System.out.print(map[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private int count(int i0, int j0) {
        int res = 0;

        for (int i = i0 - delta; i <= i0 + delta; i++) {
            for (int j = j0 - delta; j <= j0 + delta; j++) {
                if (i < 0 || j < 0 || i >= map.length || j >= map[i].length)
                    continue;
                if (map[i][j] == -1)
                    res++;
            }
        }

        return res;
    }

    private int getStatus() {
        if (nb == 0)
            return 1;
        if (nf == 0)
            return -1;
        return 0;
    }

    private void shoot(int i0, int j0) {
        if (i0 < 0 || j0 < 0 || i0 > map.length || j0 > map[i0].length) {
            System.out.println("vui lòng nhập lại");
            return;
        }
        if (map[i0][j0] == -1) {
            map[i0][j0] = 10;
            nb--;

            for (int i = i0 - delta; i <= i0 + delta; i++) {
                for (int j = j0 - delta; j <= j0 + delta; j++) {
                    if (i < 0 || j < 0 || i >= map.length || j >= map[i].length)
                        continue;
                    if (map[i][j] != -1 && map[i][j] != -2 && map[i][j] != 10)
                        map[i][j]--;

                }
            }
        } else if (map[i0][j0] == -2) {
            map[i0][j0] = count(i0, j0);
        }
        nf--;
    }

    private void play() {
        Scanner scanner = new Scanner(System.in);
        boolean isCheat = false;
        while (getStatus() == 0) {
            show(isCheat);
            System.out.println("bạn còn " + nf + " lượt bắn");
            System.out.println("còn " + nb + " tàu");
            System.out.println("hãy nhập điểm bạn muốn bắn");

            int i0 = scanner.nextInt();
            int j0 = scanner.nextInt();

            if (i0 == 12 && j0 == 34) {
                isCheat = !isCheat;
            }

            shoot(i0, j0);
            int status = getStatus();

            if (status == -1) {
                System.out.println("bạn đã thua");
            } else if (status == 1) {
                System.out.println("bạn đã thắng");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        BatTheShip game = new BatTheShip();

        game.play();
    }
}
