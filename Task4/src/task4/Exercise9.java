package task4;

public class Exercise9 {
    public static void main(String[] args) {

        String age = "21";
        String mark = "89.5";
        int salary = 35000;
        double percentage = 87.75;
        char section = 'A';

        int ageInt = Integer.parseInt(age);
        double markDouble = Double.parseDouble(mark);

        String salaryStr = Integer.toString(salary);
        String percentageStr = Double.toString(percentage);

        Integer n1 = 10;
        Integer n2 = 20;

        System.out.println("Age = " + ageInt);
        System.out.println("Mark = " + markDouble);
        System.out.println("Salary String = " + salaryStr);
        System.out.println("Percentage String = " + percentageStr);

        System.out.println("Compare = " + n1.compareTo(n2));
        System.out.println("Max = " + Integer.max(n1, n2));
        System.out.println("Min = " + Integer.min(n1, n2));

        int num = n1.intValue();
        double d = Double.valueOf(45.5).doubleValue();

        System.out.println("Integer to int = " + num);
        System.out.println("Double to double = " + d);

        System.out.println("Is Letter = " +
                Character.isLetter(section));
    }
}