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
            System.out.print("? ");
            String command = reader.nextLine();

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();

                    Birds bird=new Birds(name,latinName,0);
                    birds.put(name,bird);





            } else if (command.equals("Show")) {

                System.out.print("What? ");
                String word = reader.nextLine();

                System.out.println(birds.get(word));


            } else if (command.equals("Quit")) {

                break;
                
            } else if (command.equals("Statistics")) {

                for(String name: birds.keySet()){
                    Birds bird=birds.get(name);
                    System.out.println(bird.toString());
                }
                
            } else if (command.equals("Observation")) {

                System.out.print("What was observed:? ");
                String word=reader.nextLine();

                if(birds.containsKey(word)){
                    Birds bird=birds.get(word);
                    bird.setCounter(bird.getCounter()+1);

                }


            }

        }
    }
}
