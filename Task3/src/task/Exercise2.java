package task;

class Calculator {
    void add(int a, int b) {
        System.out.println("Addition of two integers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Addition of three integers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Addition of two doubles: " + (a + b));
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(10.5, 20.5);
    }
}