package org.example.week6.Birdwatchers;

import java.util.HashMap;
import java.util.Scanner;

public class Birdwatchers {

    private Scanner reader;


    HashMap<String, Birds> birds;

    public Birdwatchers(Scanner reader, HashMap<String, Birds> birds) {
        this.reader = reader;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.print("?");
            String command = reader.nextLine();

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                if(birds.containsKey(name)){
                    Birds bird=birds.get(name);
                    bird.setCounter(bird.getCounter()+1);
                    birds.put(name,bird);
                }
                else {
                    Birds bird=new Birds(name,latinName,1);
                    birds.put(name,bird);
                }




            } else if (command.equals("Show")) {

                System.out.print("What? ");
                String word = reader.nextLine();

                System.out.println(birds.get(word));


            } else if (command.equals("Quit")) {

                break;
                
            }

        }
    }
}
