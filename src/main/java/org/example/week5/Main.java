package org.example.week5;

import javax.swing.*;

public class Main {

    public static void main(String[] args){



        box box=new box(10);

        box.add(new Book("Fedor Dostojevski","Crime and punishment",2));
        box.add(new Book("Robert Martin","Clean Code",1));
        box.add(new Book("Kent Beck","Test Driven Development",0.5));

        box.add(new CD("Pink Floyd","Dark side of the moon",1973));
        box.add(new CD("Wigwam","Nuclear nightclub",1975));
        box.add(new CD("Randezvous Park","Closer to Being here",2012));

        System.out.println(box);


    }

}
