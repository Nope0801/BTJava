package org.hina.LanguageBase.Sodoku;

import java.util.ArrayList;
import java.util.List;

public class Maps {
    private final List<byte[][]> ls = new ArrayList<>();

    public Maps() {
        ls.add(new byte[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {3, 1, 2, 8, 4, 5, 9, 7, 6},
                {6, 9, 7, 3, 1, 2, 8, 4, 5},
                {8, 4, 5, 6, 9, 7, 3, 1, 2},
                {2, 3, 1, 5, 7, 4, 6, 9, 8},
                {9, 6, 8, 2, 3, 1, 5, 7, 4},
                {5, 7, 4, 9, 6, 8, 2, 3, 1}
        });

        ls.add(new byte[][]{
                {3, 4, 9, 6, 8, 1, 7, 5, 2},
                {5, 6, 7, 2, 3, 9, 8, 1, 4},
                {1, 2, 8, 7, 4, 5, 3, 6, 9},
                {6, 7, 3, 9, 1, 8, 4, 2, 5},
                {8, 9, 4, 3, 5, 2, 6, 7, 1},
                {2, 1, 5, 4, 6, 7, 9, 3, 8},
                {7, 5, 2, 8, 9, 3, 1, 4, 6},
                {4, 8, 1, 5, 7, 6, 2, 9, 3},
                {9, 3, 6, 1, 2, 4, 5, 8, 7}
        });

        ls.add(new byte[][]{
                {1, 4, 8, 2, 7, 5, 6, 9, 3},
                {3, 9, 6, 4, 1, 8, 7, 5, 2},
                {5, 7, 2, 3, 9, 6, 1, 4, 8},
                {8, 5, 7, 6, 2, 4, 3, 1, 9},
                {6, 1, 9, 8, 3, 7, 5, 2, 4},
                {2, 3, 4, 9, 5, 1, 8, 7, 6},
                {4, 6, 1, 5, 8, 2, 9, 3, 7},
                {9, 2, 5, 7, 6, 3, 4, 8, 1},
                {7, 8, 3, 1, 4, 9, 2, 6, 5}
        });
    }

    public byte[][] getRandom() {
        int random = (int) (Math.random() * ls.size());

        byte[][] temp = new byte[9][9];
        for (int i = 0; i < temp.length; i++) {
            System.arraycopy(ls.get(random)[i], 0, temp[i], 0, temp.length);
        }

        if (Math.random() > 0.5){
            byte[] row0 = temp[0].clone();
            byte[] row1 = temp[1].clone();
            byte[] row2 = temp[2].clone();

            temp[0] = temp[3].clone();
            temp[1] = temp[4].clone();
            temp[2] = temp[5].clone();

            temp[3] = row0;
            temp[4] = row1;
            temp[5] = row2;
        }

        if (Math.random() > 0.5){
            byte[] row0 = temp[0].clone();
            byte[] row1 = temp[1].clone();
            byte[] row2 = temp[2].clone();

            temp[0] = temp[6].clone();
            temp[1] = temp[7].clone();
            temp[2] = temp[8].clone();

            temp[6] = row0;
            temp[7] = row1;
            temp[8] = row2;
        }


        return temp;
    }
}
