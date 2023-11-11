package org.example.week6.Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseList<T> {

    public List<T> reversedList(List<T> numbers){
        List<T> list=new ArrayList<>(numbers.size());
        for(int i=numbers.size()-1;i>=0;i--){
            list.add(numbers.get(i));
        }
        return list;
    }

}
