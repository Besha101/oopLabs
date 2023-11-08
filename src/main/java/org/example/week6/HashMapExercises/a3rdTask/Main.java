package org.example.week6.HashMapExercises.a3rdTask;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");


        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();




    }
}
