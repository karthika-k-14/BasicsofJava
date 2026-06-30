package task;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        double[] salary = new double[n];
        System.out.println("Enter employee salaries:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextDouble();
        }
        double highest = salary[0];
        double lowest = salary[0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
            }
            if (salary[i] < lowest) {
                lowest = salary[i];
            }
            sum += salary[i];
        }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] > average) {
                count++;
            }
        }
        System.out.println("\nHighest Salary: " + highest);
        System.out.println("Lowest Salary: " + lowest);
        System.out.println("Average Salary: " + average);
        System.out.println("Employees earning above average: " + count);

    }
}