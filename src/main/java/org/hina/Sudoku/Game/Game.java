package org.hina.Sudoku.Game;

import org.hina.Sudoku.Map.FilterMap;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final FilterMap filterMap;
    private final List<Moves> actions;
    private int cur;

    public Game() {
        filterMap = new FilterMap();
        actions = new ArrayList<>();
        cur = -1;
    }

    public void fill(int i, int j, byte x) {
        filterMap.fill(x, i, j);
        if (cur < actions.size()) {
            while (cur < actions.size() - 1) {
                actions.removeLast();
            }
        }
        actions.add(new Moves(i, j, x));
        cur++;
    }

    public void undo() {
        if (cur > -1) {
            filterMap.undo(actions.get(cur));
            cur--;
        }
    }

    public void redo() {
        if (cur < actions.size()) {
            cur++;
            filterMap.redo(actions.get(cur));
        }
    }

    public void hint() {
        filterMap.hint();
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
