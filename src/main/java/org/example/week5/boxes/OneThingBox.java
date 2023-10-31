package org.example.week5.boxes;

public class OneThingBox extends Box {

    @Override
    public void add(Thing thing) {
        if (things.size() < 1) {
            things.add(thing);
        }
    }
}
