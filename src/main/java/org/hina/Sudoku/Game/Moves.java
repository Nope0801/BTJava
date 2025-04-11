package org.hina.Sudoku.Game;

public record Moves(int i, int j, byte x) {
    @Override
    public String toString() {
        return "Moves{" +
                "i=" + (i + 1) +
                ", j=" + (j + 1) +
                ", x=" + x +
                '}';
    }
}
