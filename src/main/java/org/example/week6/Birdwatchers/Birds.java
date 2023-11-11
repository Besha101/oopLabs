package org.example.week6.Birdwatchers;

import java.util.HashMap;

public class Birds {

        private String name;
        private String latinName;
        private int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }



    public Birds(String name, String latinName, int counter) {
        this.name = name;
        this.latinName = latinName;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + counter + " observations";
    }
}


