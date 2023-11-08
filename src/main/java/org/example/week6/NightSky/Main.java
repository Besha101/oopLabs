package org.example.week6.NightSky;

public class Main {
    public static void main(String[] args) {

        NightSky nightSky = new NightSky(20,20);
        nightSky.print();
        System.out.println("Num of stars: "+nightSky.starsInLastPrint());

    }
}
