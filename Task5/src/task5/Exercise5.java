package task5;

import java.util.Vector;

public class Exercise5 {
    public static void main(String[] args) {

        Vector<Integer> transactions = new Vector<>();

        transactions.add(1001);
        transactions.add(1002);
        transactions.add(1003);
        transactions.add(1004);
        transactions.add(1005);

        transactions.add(1001);

        System.out.println("Transactions: " + transactions);
        System.out.println("Size: " + transactions.size());
        System.out.println("Contains 1003: " + transactions.contains(1003));
    }
}