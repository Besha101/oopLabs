package org.example.week1;
import java.util.Scanner;

public class firstLab {

    public static void printName(){

        //1.

        System.out.println("Jane Doe");

    }

    public static void printSomeMessage(){

        //2.

        System.out.println("Hello World!");
        System.out.println("(And all the people of the wolrd!)");

    }

    public static void secondsInXDays(){

        //3.

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int x=Integer.parseInt(reader.nextLine());
        int s=24*60*60;
        System.out.println("Number of seconds in "+x+" days is "+(x*s));

    }

    public static void sumOfTwoNumbers(){

        //4.

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=Integer.parseInt(reader.nextLine());
        System.out.print("Enter second number: ");
        int num2=Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers is "+(num1+num2));

    }

    public static void isNumPositive(){

        //5.

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=Integer.parseInt(reader.nextLine());

        if(num>0) System.out.println("Number is positive");
        else System.out.println("Number is negative");

    }

    public static void greaterNumber(){

        //6.

        Scanner reader=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=Integer.parseInt(reader.nextLine());
        System.out.print("Enter the second number: ");
        int num2=Integer.parseInt(reader.nextLine());

        if(num1>num2) System.out.println("Greater number: "+num1);
        else if (num2>num1) {
            System.out.println("Greater number: "+num2);
        }
        else System.out.println("Numbers are equal");

    }




    public static void main(String[] args){





    }

}
