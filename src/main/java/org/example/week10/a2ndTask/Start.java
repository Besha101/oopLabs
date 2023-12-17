package org.example.week10.a2ndTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> grades= Arrays.asList(90,85,95,88,92);
        GradeAnalyzer gradeAnalyzer=new GradeAnalyzer(grades);
        Class<?> gradeAnalyzerClass=gradeAnalyzer.getClass();

        Field[] fields=gradeAnalyzerClass.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            System.out.println("Name: "+field.getName()+" value: "+field.get(gradeAnalyzer));
        }

        Method[] methods = gradeAnalyzerClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method name: " + method.getName() + ", Result: " + method.invoke(gradeAnalyzer));
            }
        }
    }
}
