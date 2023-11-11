package org.example.week6.Generics;

import java.util.List;

public class EvenOdd {

    public static int sumOfEvenAndOdd(List<? extends Number> numbers){
        int evenSum=0;
        int oddSum=0;

        for(Number number:numbers){
            double num=number.doubleValue();
            if(num%2==0){
                evenSum+=num;
            }
            else oddSum+=num;
        }
        System.out.println("Sum of even: "+evenSum);
        System.out.println("Sum of odd: "+oddSum);

        return evenSum+oddSum;
    }



}
