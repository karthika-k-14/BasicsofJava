package exercise10;

import exercise10.Employee;
import exercise10.Person;
import exercise10.SalaryCalculation;

abstract class Person {
    abstract void displayDetails();
}

interface SalaryCalculation {
    void calculateSalary();
}

class Employee extends Person implements SalaryCalculation {
    int employeeId;
    String employeeName;
    double basicSalary;
    double totalSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() {
        totalSalary = basicSalary + (basicSalary * 0.10); // 10% bonus
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Exercise10 {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Arul", 30000);

        emp.calculateSalary();
        emp.displayDetails();
    }
}