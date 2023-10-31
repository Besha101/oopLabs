package org.example.week5.boxes;


public class MaxWeightBox extends Box {

    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() + currentWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    protected int getMaxWeight() {
        return maxWeight;
    }
}
