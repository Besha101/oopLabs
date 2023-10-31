package org.example.week5.boxes;

public class Main {
    public static void main(String[] args) {

        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox();
        Box box3 = new BlackHoleBox();
        Box box4 = new Box() {
            @Override
            public void add(Thing thing) {
                things.add(thing);
            }
        };


        Thing thing1 = new Thing("Thing 1", 5);
        Thing thing2 = new Thing("Thing 2", 8);


        box1.add(thing1);
        box2.add(thing2);
        box3.add(thing1);
        box4.add(thing2);


        if (box1 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox = (MaxWeightBox) box1;
            System.out.println("Downcasted to MaxWeightBox");
        }

        if (box2 instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box2;
            System.out.println("Downcasted to OneThingBox");
        }

        if (box3 instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box3;
            System.out.println("Downcasted to BlackHoleBox");
        }

        if (box4 instanceof Box) {
            Box box = (Box) box4;
            System.out.println("Downcasted to Box");
        }
    }
}
