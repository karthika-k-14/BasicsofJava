package exercise8;

public class Exercise8 {
	public static void main(String[]args) {
		int Subject1 = 94;
		int Subject2 = 97;
		int Subject3 = 92;
		int Subject4 = 98;
		int Subject5 = 93;
		int Total = Subject1+Subject2+Subject3+Subject4+Subject5;
		double Average= Total/5 *100;
		double Percentage = Total/500.0*100;
		
		System.out.println("Total:" + Total);
		System.out.println("Average:" + Average);
		System.out.println("Percentage:" + Percentage);
		
	}

}
