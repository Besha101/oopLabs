package org.example.week10.a2ndTask;

import java.util.List;

public class GradeAnalyzer {

    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }


    public double calculateAverage(){
        double sum=0;

        for(Integer grade: grades){
            sum+=grade;
        }

        return sum/grades.size();

    }

    public void printSummary(){
        System.out.println("Grades: "+grades);
        System.out.println("Average grade: "+calculateAverage());
    }
}
