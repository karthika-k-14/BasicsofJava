package task5;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {

        ArrayList<String> emp = new ArrayList<>();

        emp.add("John");
        emp.add("David");
        emp.add("Sam");
        emp.add("Peter");

        emp.add(2, "Arun");
        emp.remove("Sam");

        System.out.println("Contains David: " + emp.contains("David"));
        System.out.println("Index of Peter: " + emp.indexOf("Peter"));

        emp.set(1, "Kumar");

        System.out.println("Employee at index 2: " + emp.get(2));
        System.out.println("Is Empty: " + emp.isEmpty());
        System.out.println("Total Employees: " + emp.size());

        emp.clear();

        System.out.println("After Clear: " + emp);
    }
}