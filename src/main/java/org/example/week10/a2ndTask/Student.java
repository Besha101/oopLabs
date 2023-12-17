package org.example.week10.a2ndTask;

import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private int ID;
    private List<Integer> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo(){
        System.out.println("Id: "+ID+" name: "+name+" grades:"+ grades);
    }
}
