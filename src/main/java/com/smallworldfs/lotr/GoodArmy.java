package com.smallworldfs.lotr;

public enum GoodArmy {
    PELOSO(1),
    SURENO(2),
    ENANO(3),
    NUMENOREANO(4),
    ELFO(5);

    private final int score;

    private GoodArmy(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
