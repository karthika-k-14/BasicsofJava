package task;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Resume Summary:");
        String summary = sc.nextLine();
        String[] words = summary.trim().split("\\s+");
        int count = words.length;
        System.out.println("Word Count: " + count);
    }
}