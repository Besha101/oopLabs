package org.example.week6.HashMapExercises.a1stAnd2ndTask;

public class Main {

    public static void main(String[] args) {

        /*
        HashMap<String,String> name=new HashMap<>();

        name.put("matti","mage");
        name.put("mikael","mixu");
        name.put("arto","arppa");

        String nickname=name.get("mikael");
        System.out.println(nickname);

         */

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));




    }

}
