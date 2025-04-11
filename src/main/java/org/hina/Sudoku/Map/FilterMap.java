package org.hina.Sudoku.Map;


import org.hina.Sudoku.Exception.IllegalInputException;
import org.hina.Sudoku.Game.Moves;

public class FilterMap implements Map {
    private final Map answer;
    private final byte[][] aMap;

    public FilterMap() {
        answer = new RandomMap();
        aMap = new byte[answer.getMap().length][answer.getMap().length];

        for (int i = 0; i < aMap.length; i++) {
            for (int j = 0; j < aMap[i].length; j++) {
                aMap[i][j] = answer.getBox(i, j);
            }
        }

        for (int i = 0; i < aMap.length; i++) {
            for (int j = 0; j < aMap.length; j++) {
                double random = Math.random();
                this.aMap[i][j] = (random > 0.2f) ? aMap[i][j] : 0;
            }
        }
    }

    public void undo(Moves move) {
        aMap[move.i()][move.j()] = 0;
    }

    public void redo(Moves move) {
        aMap[move.i()][move.j()] = move.x();
    }

    public void hint() {
        for (int i = 0; i < aMap.length; i++) {
            for (int j = 0; j < aMap.length; j++) {
                if (aMap[i][j] == 0) {
                    System.out.println(new Moves(i, j, answer.getBox(i, j)));
                    return;
                }
            }
        }
    }

    public void fill(byte x, int i0, int j0) {
        if (i0 < 0 || j0 < 0 || i0 >= 9 || j0 >= 9 || x < 1 || x > 9) {
            throw new IllegalInputException("Only numbers from 1 to 9!");
        }

        if (aMap[i0][j0] != 0) {
            throw new IllegalInputException("fill in * only!");
        }

        aMap[i0][j0] = x;
    }

    public void print() {
        for (var i : aMap) {
            for (var j : i)
                System.out.print(((j == 0) ? "*" : j) + " ");
            System.out.println();
        }
    }

    @Override
    public byte[][] getMap() {
        return aMap;
    }

    @Override
    public byte getBox(int i, int j) {
        return aMap[i][j];
    }

    public boolean isFillAll() {
        for (var i : aMap) {
            for (var j : i)
                if (j == 0)
                    return false;
        }

        return true;
    }

    public byte[][] getAns() {
        return answer.getMap();
    }
}
