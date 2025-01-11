package org.hina.LanguageBase.Sodoku;

import lombok.Getter;

@Getter
public class RenderAnswer {
    private final byte[][] ans;

    public RenderAnswer() {
        Maps maps = new Maps();
        ans = maps.getRandom();
    }

    public byte getBox (int i, int j){
        return ans[i][j];
    }
}
