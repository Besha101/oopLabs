package org.example.week6.HashMapExercises.a1stAnd2ndTask;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String,Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        loans.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        return loans.getOrDefault(whose,0.0);
    }

}
