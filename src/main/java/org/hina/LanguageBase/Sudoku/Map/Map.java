package org.hina.LanguageBase.Sudoku.Map;

public interface Map {
    byte[][] getMap();

    byte getBox(int i, int j);
}
