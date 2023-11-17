package org.example.week7.a1stTask;

public record RecordLogger(String name) implements Logger{

    @Override
    public void logMessage(String message) {
        System.out.println("Log name: "+name+"\n   message: "+message);
    }



}