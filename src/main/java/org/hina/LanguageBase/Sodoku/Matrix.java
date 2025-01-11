package org.hina.LanguageBase.Sodoku;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matrix {
    List<List<Integer>> matrix = new ArrayList<>();

    public boolean add(int x) {
        if (matrix.isEmpty() || matrix.getLast().size() >= 9)
            matrix.add(new ArrayList<>());
        System.out.println("matrix: " + matrix.size());

        int i0 = matrix.size() - 1;
        int j0 = matrix.getLast().size();

        if (!valid(x, i0, j0))
            return false;


        matrix.getLast().add(x);

        return true;
    }

    public boolean valid(int x, int i0, int j0) {
        int blockI = i0 / 3;
        int blockJ = j0 / 3;

        blockI *= 3;
        blockJ *= 3;

        System.out.println(blockI + " " + blockJ);

        for (int i = blockI; i < Math.min(blockI + 3, matrix.size()); i++) {
            for (int j = blockJ; j < Math.min(blockJ + 3, matrix.get(i).size()); j++) {
                if (x == matrix.get(i).get(j)) {
                    System.out.println("block false");
                    return false;
                }
            }
        }

        for (int col: matrix.get(i0))
            if (x == col) {
                System.out.println("row false");
                return false;
            }

        for (var row: matrix)
            if (j0 < row.size() && x == row.get(j0)) {
                System.out.println("colum false");
                return false;
            }

        System.out.println("true");
        return true;
    }

    public void print() {
        matrix.forEach(row -> {
            row.forEach(element -> System.out.print(element + " "));
            System.out.println(); // Xuống dòng sau mỗi hàng
        });
    }
}
