package org.example.week7.a3rdTask;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem=new EmployeeManagementSystem();

        List<Employee> employeeList = List.of(
                new Employee(1, "Ali Imran Alic", 50000.0),
                new Employee(2, "Adnan Ferhatovic", 60000.0),
                new Employee(3, "Dzanan Habibija", 75000.0),
                new Employee(4, "Ajdin Besic", 80000.0)
        );

        employeeManagementSystem.filterEmployeesBySalary(employeeList,60000);
        System.out.println("\nTotal salary is: "+employeeManagementSystem.calculateTotalSalary(employeeList)+"\n");
        employeeManagementSystem.displayEmployeeDetails(employeeList);
    }

}
