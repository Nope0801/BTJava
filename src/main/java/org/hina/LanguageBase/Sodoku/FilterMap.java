package org.hina.LanguageBase.Sodoku;


public class FilterMap {
    private final RenderAnswer answer;
    private final byte[][] aMap;

    public FilterMap() {
        answer = new RenderAnswer();
        aMap = new byte[answer.getAns().length][answer.getAns().length];
//        this.aMap = answer.getAns().clone();


        for (int i = 0; i < aMap.length; i++) {
            for (int j = 0; j < aMap[i].length; j++) {
                aMap[i][j] = answer.getBox(i, j);
            }
        }

        for (int i = 0; i < aMap.length; i++) {
            for (int j = 0; j < aMap.length; j++) {
                double random = Math.random();
                this.aMap[i][j] = (random > 0.2)? aMap[i][j] : 0;
            }
        }
    }

    public boolean fill (byte x, int i0, int j0){
        if (i0 < 0 || j0 < 0 || i0 >= 9 || j0 >= 9 || x < 1 || x > 9){
            System.err.println("Only numbers from 1 to 9");
            return true;
        }

        if (aMap[i0][j0] != 0){
            System.err.println("this box is filled !");
        }

        if (x != answer.getBox(i0, j0))
            return false;

//        System.err.println("true");
        aMap[i0][j0] = x;
        return true;
    }

    public byte[][] getaMap() {
        return aMap;
    }

    public void print (){
        for (var i: aMap) {
            for (var j : i)
                System.out.print(((j == 0)? "*": j) + " ");
            System.out.println();
        }
    }

    public boolean isWin (){
        boolean win = true;
        for (var i: aMap) {
            for (var j : i)
                if (j == 0) {
                    win = false;
                    break;
                }
        }

        return win;
    }
}
