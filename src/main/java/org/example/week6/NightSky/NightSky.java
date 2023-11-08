package org.example.week6.NightSky;

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density){
        this(density, 20, 10);
    }

    public NightSky(int width, int height){
        this(0.1,width,height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){

        Random random=new Random();




        for(int i=0;i<=width;i++){
            if(random.nextDouble()<=density) {
                System.out.print("*");


            }
            else System.out.print(" ");
        }



        System.out.println();

    }

    public void print(){
        Random random=new Random();
        int countStars=0;


        for(int j=0;j<height;j++){
        for(int i=0;i<=width;i++){
            if(random.nextDouble()<=density) {
                System.out.print("*");
                countStars++;

            }
            else System.out.print(" ");
        }


        starsInLastPrint=countStars;
        System.out.println();
    }
    }

    public int starsInLastPrint(){
        return starsInLastPrint;
    }

}
