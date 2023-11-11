package org.example.week6.Generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        double totalSum=EvenOdd.sumOfEvenAndOdd(integerList);

        System.out.println("Total sum: "+totalSum);

         */

        ReverseList<Integer> integerReverser = new ReverseList<>();
        List<Integer> originalIntList = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedIntList = integerReverser.reversedList(originalIntList);
        System.out.println("Original List: " + originalIntList);
        System.out.println("Reversed List: " + reversedIntList);

        ReverseList<String> stringReverser = new ReverseList<>();
        List<String> originalStrList = List.of("apple", "banana", "cherry");
        List<String> reversedStrList = stringReverser.reversedList(originalStrList);
        System.out.println("Original List: " + originalStrList);
        System.out.println("Reversed List: " + reversedStrList);


    }




}
