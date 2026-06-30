package exercise9;

import exercise9.Employee;

class Employee {
    int employeeId;
    String employeeName;
    double salary;
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
public class Exercise9 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Arul", 25000);
        employees[1] = new Employee(102, "Kavi", 35000);
        employees[2] = new Employee(103, "Priya", 40000);
        employees[3] = new Employee(104, "Ravi", 28000);
        employees[4] = new Employee(105, "Meena", 50000);
        System.out.println("Employees with Salary Greater Than 30000:");
        for (Employee emp : employees) {
            if (emp.salary > 30000) {
                emp.display();
            }
        }
    }
}