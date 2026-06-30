package task;

abstract class BankAccount {
    abstract void calculateInterest();
    void displayBankName() {
        System.out.println("Bank Name: State Bank of India");
    }
}
class SavingsAccount extends BankAccount {
    @Override
    void calculateInterest() {
        double balance = 10000;
        double interest = balance * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}
class CurrentAccount extends BankAccount {
    @Override
    void calculateInterest() {
        double balance = 10000;
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.displayBankName();
        sa.calculateInterest();
        CurrentAccount ca = new CurrentAccount();
        ca.displayBankName();
        ca.calculateInterest();
    }
}