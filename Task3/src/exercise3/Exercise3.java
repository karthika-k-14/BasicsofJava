package exercise3;

import exercise3.Employee;
import exercise3.FullTimeEmployee;
import exercise3.PartTimeEmployee;

class Employee {
    void calculateSalary() {
        System.out.println("Calculating Employee Salary");
    }
}
class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        int monthlySalary = 50000;
        System.out.println("Full-Time Employee Salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        int hourlyRate = 500;
        int hoursWorked = 40;
        System.out.println("Part-Time Employee Salary: " + (hourlyRate * hoursWorked));
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();
        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}