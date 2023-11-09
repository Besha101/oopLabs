package org.example.week6.Tasks1to7;

public class Tasks1to7 {

    public static int smallest(int[] array){
        int min=array[0];
        int i;
        for(i=0;i<array.length-1;i++){

            if(array[i]<min) {
                min = array[i];
            }


        }

        return min;
    }


    public static int indexOfTheSmallest(int[] array){
        int min=array[0];
        int i;
        for(i=0;i< array.length-1;i++){

            if(array[i]<min) min=i;

        }

        return min;


    }


    public static int indexOfTheSmallestStartingFrom(int[] array,int index){
        int min=array[index];
        int i;
        int retIndex=index;
        for(i=index;i< array.length-1;i++){

            if(array[i]<min) {
                min=array[i];
                retIndex=i;
            }

        }

        return retIndex;
    }

    public static void swap(int[] array, int index1, int index2){

        int temp=array[index1];

        array[index1]=array[index2];

        array[index2]=temp;

    }






}
