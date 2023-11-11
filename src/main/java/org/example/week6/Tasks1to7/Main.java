package org.example.week6.Tasks1to7;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.week6.Tasks1to7.Tasks1to7.*;

public class Main {

    public static void main(String[] args) {


        /*
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
         */
        /*
        BinarySearch binarySearch=new BinarySearch();

        int[] array ={-3,2,3,4,7,8,12};
        Scanner reader=new Scanner(System.in);

        System.out.println("Values of the array: "+Arrays.toString(array));

        System.out.print("Enter searched number: ");
        String searchedNumber=reader.nextLine();
        System.out.println();

        boolean result=binarySearch.search(array,Integer.parseInt(searchedNumber));

        if(result) System.out.println("Value "+searchedNumber+" is in the array");
        else System.out.println("Value "+searchedNumber+" is not in the array");

         */

        int[] array={5,1,3,4,2};
        printElegantly(array);


    }


}
