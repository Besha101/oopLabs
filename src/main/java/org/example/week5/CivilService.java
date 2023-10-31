package org.example.week5;

public class CivilService implements NationalService{

    private int daysLeft;

    public CivilService(int daysLeft){
        this.daysLeft=daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return 0;
    }

    @Override
    public void work() {

    }
}
