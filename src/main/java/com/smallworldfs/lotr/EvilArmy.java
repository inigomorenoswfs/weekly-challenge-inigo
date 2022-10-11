package com.smallworldfs.lotr;

public enum EvilArmy {
    ORCO(2),
    GOBLIN(2),
    HUARGO(3),
    TROLL(5);

    private final int score;

    private EvilArmy(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
