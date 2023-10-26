package org.example.week4.people;

public class Student extends Person{
    private int credits;
    private int student_id;
    private int grades;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int addGrade(int grade){
        this.grades+=grade;
        return this.grades;
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
