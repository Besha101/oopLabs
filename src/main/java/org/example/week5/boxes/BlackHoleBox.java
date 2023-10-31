package org.example.week5.boxes;


public class BlackHoleBox extends Box {

    public BlackHoleBox() {
    }

    @Override
    public void add(Thing thing) {

        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {

        return false;
    }
}
