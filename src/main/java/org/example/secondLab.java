package org.example;
import java.util.Random;
import java.util.Scanner;

public class secondLab {

    public static void pwChecker(){

        //1.

        String checker="";
        String pwcheck="";
        Scanner reader=new Scanner(System.in);
        System.out.print("Type your word: ");
        checker=reader.nextLine();

        while(checker!=pwcheck){
            System.out.print("Type the password: ");
            pwcheck=reader.nextLine();
            if (pwcheck.equals(checker)) {
                System.out.println("The secret is: jryy qbar");
                break;

            }
            System.out.println("wrong!");
        }


    }

    public static void sumOfThreeNumbers(){

        //2.

        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;

        System.out.print("Enter first number: ");
        read=reader.nextInt();
        sum+=read;

        System.out.print("Enter second number: ");
        read=reader.nextInt();
        sum+=read;

        System.out.print("Enter third number: ");
        read=reader.nextInt();
        sum+=read;

        System.out.println("Sum: "+sum);


    }

    public static void sumOfXNumbers(){

        //3.

        int num1=1;
        Scanner reader=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter numbers you wanna sum, if you wanna exit type 0");

        while(num1!=0){

            num1= reader.nextInt();
            if (num1==0) break;
            sum+=num1;
            System.out.println("Sum now: "+sum);

        }
        System.out.println("Sum is: "+sum);



    }

    public static void printNumbersBetweenSelectedTwo(){

        //4.

        Scanner reader=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1= reader.nextInt();

        System.out.print("Enter second number: ");
        int num2= reader.nextInt();

        int i=num1;

        while(i<=num2){

            System.out.println(i);
            i++;

        }

    }

    public static void twoToThePowerNToThatN(){

        //5.
        /*
        Create a program that calculates the sum of 2tothe0+2tothe1+2tothe2+...+2totheN,
        where n is a number entered by the user. The notation 2i means
        raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16.
        In Java we cannot write ab directly, but instead we can calculate the
        power with the command Math.pow(number, power). Note that the command
        returns a number of double type (i.e. floating point number). A double
        can be converted into the int type (i.e. whole number)
        as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23
        to variable result.
         */

        Scanner reader=new Scanner(System.in);

        System.out.print("Type a number: ");
        int num= reader.nextInt();
        int sum=0;

        for (int i=0;i<=num;i++){

            sum+=(int)Math.pow(2,i);

        }

        System.out.println("The result is: "+sum);



    }

    private static void printStars(int amount) {

        //7.

        for(int i=0;i<amount;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawStarsPiramid(int size){

        //8.

        for(int i=1;i<=size;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void drawNumbersPiramid(int size){

        //9.

        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }

    public static void guessNumber(){

        //10.


        Random rand=new Random();
        Scanner reader=new Scanner(System.in);

        int counter=1;

        int num=rand.nextInt(101);
        System.out.print("Guess a number: ");
        int userGuess= reader.nextInt();

        while(true){
            if(userGuess>num){
                System.out.println("The number is lesser!");
                counter++;
                System.out.print("Guess a number: ");
                userGuess=reader.nextInt();
            }
            else if(userGuess<num){
                System.out.println("The number is greater!");
                counter++;
                System.out.print("Guess a number: ");
                userGuess=reader.nextInt();
            }
            else {System.out.println("Congratulations, your guess is correct!\nYou made it in "+counter+" tries.");

                break;
            }

        }}





    public static void main(String[] args){





    }

}
