package exercise4;

import exercise4.Person;
import exercise4.Student;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int rollNo;
    String department;
    Student(String name, int age, int rollNo, String department) {
        super(name, age); // Calling parent class constructor
        this.rollNo = rollNo;
        this.department = department;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Student s = new Student("Arul", 20, 101, "CSE");
        s.display();
    }
}