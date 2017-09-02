package net.thedragonteam.blockyrewards.obj;

public class RewardChance extends Reward {

    private final int valueToMatch;

    public RewardChance(int i, int valueToMatch) {
        super(i);
        this.valueToMatch = valueToMatch;
    }

    public int getValueToMatch() {
        return valueToMatch;
    }
}
