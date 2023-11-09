package org.example.week6.Birdwatchers;

import org.example.week6.HashMapExercises.a3rdTask.Dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        HashMap<String,Birds>birds=new HashMap<>();

        Birdwatchers birdwatchers=new Birdwatchers(reader,birds);

        birdwatchers.start();
    }
}
