package org.example.people;

public class Student extends Person{
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void study(){
        credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits: " + credits;
    }




    public static void main(String[] args){
        Student olli=new Student("Olli","Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits: "+olli.credits);
        olli.study();
        System.out.println("credits: "+olli.credits);
    }
}
