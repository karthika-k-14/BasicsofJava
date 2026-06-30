package task5;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Arul");
        students.add("Priya");
        students.add("Ravi");
        students.add("Kumar");
        students.add("Divya");

        System.out.println("Student Names: " + students);

        students.add("Arul"); // duplicate
        students.add(null);   // null value

        System.out.println("Updated List: " + students);
        System.out.println("Size: " + students.size());
    }
}