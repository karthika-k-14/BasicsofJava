package task4;

abstract class Employee {
    abstract void calculateSalary();

    void displayCompanyName() {
        System.out.println("ABC Company");
    }
}

class PermanentEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Permanent Employee Salary: Rs.50000");
    }
}

class ContractEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Contract Employee Salary: Rs.25000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        ContractEmployee c = new ContractEmployee();

        p.displayCompanyName();
        p.calculateSalary();

        c.displayCompanyName();
        c.calculateSalary();
    }
}