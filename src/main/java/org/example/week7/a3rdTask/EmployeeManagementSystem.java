package org.example.week7.a3rdTask;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public void filterEmployeesBySalary(List<Employee> employeeList,double minimum){
        List<Employee> newList=new ArrayList<>();
        for(Employee employee:employeeList){
            if(employee.salary()>=minimum) newList.add(employee);
        }

        displayEmployeeDetails(newList);
    }

    public double calculateTotalSalary(List<Employee> employeeList){
        double sum=0;
        for(Employee employee:employeeList){
            sum+= employee.salary();
        }

        return sum;
    }

    public void displayEmployeeDetails(List<Employee> employeeList){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }



}
