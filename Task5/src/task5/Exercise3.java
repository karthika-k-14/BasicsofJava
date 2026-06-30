package task5;

import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {

        LinkedList<String> products = new LinkedList<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");

        products.addFirst("Mobile");
        products.addLast("Printer");

        products.removeFirst();
        products.removeLast();

        System.out.println("Products: " + products);
    }
}