package org.example.week6.LibraryInformationSystem;

public class StringUtils {
    public static boolean included(String word,String searched){
        if(word==null || searched==null){
            return false;
        }
        return word.toLowerCase().contains(searched.toLowerCase().trim());

    }
}
