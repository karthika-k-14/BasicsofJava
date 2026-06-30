package task5;

import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {

        LinkedList<String> customers = new LinkedList<>();

        customers.add("Arul");
        customers.add("Priya");
        customers.add("Ravi");

        customers.addFirst("Kumar");
        customers.addLast("Divya");

        System.out.println("First Customer: " + customers.getFirst());
        System.out.println("Last Customer: " + customers.getLast());

        customers.removeFirst();
        customers.removeLast();

        System.out.println("Contains Ravi: " + customers.contains("Ravi"));
        System.out.println("Total Customers: " + customers.size());

        System.out.println("Customers: " + customers);
    }
}