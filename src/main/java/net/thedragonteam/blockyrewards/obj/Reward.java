package net.thedragonteam.blockyrewards.obj;

import java.util.Random;

public class Reward {

    private final int i;
    private final Random random = new Random();

    public Reward(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public Random getRandom() {
        return random;
    }
}
