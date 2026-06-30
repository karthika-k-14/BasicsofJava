package task4;

interface Payment {
    void makePayment(double amount);
}

class UPIPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using UPI");
    }
}

class CardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using Card");
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.makePayment(1500);
        p2.makePayment(2500);
    }
}