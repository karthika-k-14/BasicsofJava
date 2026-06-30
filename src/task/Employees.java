package task;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employees extends Person {
    int employeeId;
    String department;

    Employees(String name, int age, int employeeId, String department) {
        super(name, age); // Initialize parent class variables
        this.employeeId = employeeId;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employees emp = new Employees("Arul", 22, 101, "Java Development");
        emp.displayDetails();
    }
}