package com.smallworldfs.lotr;

import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MiddleEarthChallenge {

    public static void main (String[] args) {
        EnumMap<GoodArmy, Integer> goodArmy = new EnumMap<>(GoodArmy.class);
        EnumMap<EvilArmy, Integer> evilArmy = new EnumMap<>(EvilArmy.class);

        goodArmy.put(GoodArmy.NUMENOREANO, 3);
        evilArmy.put(EvilArmy.TROLL, 4);

        battleForMiddleEarth(goodArmy, evilArmy);
    }

    private static void battleForMiddleEarth(EnumMap<GoodArmy, Integer> goodArmy, EnumMap<EvilArmy, Integer> evilArmy) {
        if (isNotArmyEmpty(goodArmy) && isNotArmyEmpty(evilArmy)) {

            AtomicInteger goodArmyScore = new AtomicInteger(0);
            AtomicInteger evilArmyScore = new AtomicInteger(0);

            goodArmy.forEach((key, value) ->
                goodArmyScore.addAndGet(key.getScore() * value)
            );

            evilArmy.forEach((key, value) ->
                evilArmyScore.addAndGet(key.getScore() * value)
            );

            battle(goodArmyScore.get(), evilArmyScore.get());
        } else {
            System.out.println("There are no enemies at sight");
        }
    }

    private static <K extends Enum<K>> boolean isNotArmyEmpty(EnumMap <K, Integer> army) {
        return !army.isEmpty();
    }

    private static void battle(int goodArmyScore, int evilArmyScore) {
        if (goodArmyScore > evilArmyScore) {
            System.out.println("Galadriel wins, Middle Earth is safe ");
        } else if (goodArmyScore < evilArmyScore) {
            System.out.println("Sauron wins, gg well played");
        } else {
            System.out.println("There's a draw");
        }
    }


}
