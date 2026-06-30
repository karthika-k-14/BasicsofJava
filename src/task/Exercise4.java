package task;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][4];
        int topper = 0;
        int highestTotal = 0;
        System.out.println("Enter marks for 3 students in 4 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += marks[i][j];
            }
            double average = (double) total / 4;
            System.out.println("Student " + (i + 1) + " Total = " + total);
            System.out.println("Student " + (i + 1) + " Average = " + average);
            if (total > highestTotal) {
                highestTotal = total;
                topper = i + 1;
            }
        }
        System.out.println("Topper Student Number: " + topper);
    }
}