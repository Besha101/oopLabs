package org.example.week7.a1stTask;

public class Main {

    public static void main(String[] args) {
        RecordLogger recordLogger = new RecordLogger("Ajdin");
        ClassLogger classLogger = new ClassLogger("Besic");


        Logger object1 = (String message) -> recordLogger.logMessage("Some message");
        Logger object2 = (String message) -> classLogger.logMessage("Some message");

        object1.logMessage("Some message");
        object2.logMessage("Some message");



    }

}
