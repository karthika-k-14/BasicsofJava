package bankaccount;

class BankAccount{
    private double balance = 10000;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
    }
    void withdraw(double amount)
    {
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.deposit(5000);
        b1.withdraw(2000);
        b1.checkBalance();
    }
}