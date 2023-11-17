package org.example.week7.a1stTask;

public class ClassLogger implements Logger{

    private String name;

    public ClassLogger(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void logMessage(String message) {
        System.out.println("Log name: "+name+"\n   message: "+message);
    }
}
