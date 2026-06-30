package task;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.endsWith("@gmail.com")) {
            System.out.println("Valid Company Email");
        } else {
            System.out.println("Invalid Company Email");
        }

  
    }
}