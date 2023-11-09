package org.example.week6.Tasks1to7;

import java.util.Arrays;

import static org.example.week6.Tasks1to7.Tasks1to7.*;

public class Main {

    public static void main(String[] args) {



        int[] values= {6,5 ,8,7,11};
        System.out.println("Smallest num is: "+smallest(values));
        System.out.println("Index of the smallest num is: "+indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values,1));
        System.out.println(indexOfTheSmallestStartingFrom(values,2));
        System.out.println(indexOfTheSmallestStartingFrom(values,4));
        System.out.println(Arrays.toString(values));
        swap(values,1,0);
        System.out.println(Arrays.toString(values));
    }


}
