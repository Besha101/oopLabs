package org.example.week5;

import java.util.ArrayList;

public class box implements ToBeStored{

    private double maxWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> items;

    public box(double maxWeight){
        this.maxWeight=maxWeight;
        this.currentWeight=0;
        this.items=new ArrayList<>();
    }

    @Override
    public double weight() {
        return currentWeight;
    }

    public void add(ToBeStored item){
        if(currentWeight+item.weight()<=maxWeight){
            items.add(item);
            currentWeight+= item.weight();
        }
    }

    public String toString(){

        return "Box: "+items.size()+" things, total weight "+currentWeight+" kg";

    }




}
