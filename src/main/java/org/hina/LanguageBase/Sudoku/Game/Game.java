package org.hina.LanguageBase.Sudoku.Game;

import org.hina.LanguageBase.Sudoku.Map.FilterMap;

public class Game {
    private final FilterMap filterMap;

    public Game() {
        filterMap = new FilterMap();
    }

    public void fill(int i, int j, byte x) {
        filterMap.fill(x, i, j);
    }

    public void print() {
        filterMap.print();
    }

    public boolean isWin() {
        var playerFill = filterMap.getMap();
        var ans = filterMap.getAns();
        for (int i = 0; i < playerFill.length; i++) {
            for (int j = 0; j < playerFill[i].length; j++) {
                if (playerFill[i][j] != ans[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isFillAll() {
        return filterMap.isFillAll();
    }
}
