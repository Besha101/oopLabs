package org.example.week6.Tasks1to7;

import java.util.Arrays;

import static java.util.Collections.binarySearch;
import static java.util.Collections.sort;

public class BinarySearch {

    private int[] arrayList;


    public int[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(int[] arrayList) {
        this.arrayList = arrayList;
    }

    public boolean search(int[] arrayList, int num){
        Arrays.sort(arrayList);
        if(Arrays.binarySearch(arrayList,num)>0){

            return true;

        }
        return false;
    }
}
