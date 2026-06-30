package task4;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrinterMachine implements Printable, Scannable {

    public void print() {
        System.out.println("Printing Document");
    }

    public void scan() {
        System.out.println("Scanning Document");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        PrinterMachine pm = new PrinterMachine();

        pm.print();
        pm.scan();
    }
}