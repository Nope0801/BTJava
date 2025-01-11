package org.hina.LanguageBase.Sodoku;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Block {
    int[][] block = new int[3][3];

    public boolean notExited(int x) {
        for (int[] row : block) {
            for (int col: row) {
                if (x == col)
                    return false;
            }
        }

        return true;
    }

    public boolean notExitedOnRow (int x, int i0){
        for (int col: block[i0]) {
            if (x == col)
                return false;
        }

        return true;
    }

    public boolean notExitedOnCol(int x, int j0) {
        for (int[] row: block)
            if (x == row[j0])
                return false;

        return true;
    }

    public void printRow (int i){
        for (int x: block[i])
            System.out.print(i + " ");
    }
}
