package task;

interface Payment {
    void makePayment(double amount);
}
class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}
class CardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Card.");
    }
}
public class Exercise6 {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        p1.makePayment(1500.50);
        Payment p2 = new CardPayment();
        p2.makePayment(2500.75);
    }
}