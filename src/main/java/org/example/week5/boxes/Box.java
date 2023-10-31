package org.example.week5.boxes;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public abstract class Box {
    protected List<Thing> things;

    public Box() {
        this.things = new ArrayList<>();
    }

    public abstract void add(Thing thing);

    protected int getMaxWeight() {
        return Integer.MAX_VALUE; // Default maxWeight value
    }

    public int currentWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
