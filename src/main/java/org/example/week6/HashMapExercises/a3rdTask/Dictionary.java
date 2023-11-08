package org.example.week6.HashMapExercises.a3rdTask;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    HashMap<String,String> words;

    public Dictionary() {
        this.words = new HashMap<>();
    }

    public void add(String word,String translation){
        words.put(word,translation);
    }

    public String translate(String word){

            return words.get(word);

    }

    public int amountOfWords(){
        return words.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<>();

        for(String key:words.keySet()){
            String translation=words.get(key);
            translationList.add(key+" = "+translation);
        }
        return translationList;

        }
    }


