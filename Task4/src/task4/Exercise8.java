package task4;

import java.util.Scanner;

class InvalidAge extends Exception {
    InvalidAge(String msg) {
        super(msg);
    }
}

public class Exercise8 {

    static void validateAge(int age) throws InvalidAge {

        if(age < 18)
            throw new InvalidAge("Age should be 18 and above");

        System.out.println("Eligible for registration");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            validateAge(age);
        }
        catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}