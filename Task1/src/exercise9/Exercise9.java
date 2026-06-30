package exercise9;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[]args) {
		System.out.println("Enter your Salary:");
		Scanner sc = new Scanner (System.in);
		double BasicSalary = sc.nextDouble();
		double HRA =BasicSalary *20/100;
		double DA =BasicSalary *10/100;
		double Tax = BasicSalary *5/100;
		double GrossSalary=BasicSalary+HRA+DA;
		double NetSalary = GrossSalary-Tax;
		System.out.println("BasicSalary:" + BasicSalary);
		System.out.println("HRA:" + HRA);
		System.out.println("DA:" + DA);
		System.out.println("Tax:" + Tax);
		System.out.println("NetSalary:" + NetSalary);
		
	}

}
