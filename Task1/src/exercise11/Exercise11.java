package exercise11;

 class Exercise11 {
	 String StudentId;
	 String Studentname;
	 String Department;
	 public Exercise11(String studentId, String studentname, String department) {
		super();
		StudentId = studentId;
		Studentname = studentname;
		Department = department;
	 }
	  void display() {
	        System.out.println("Student Id: " + StudentId);
	        System.out.println("Student Name: " + Studentname);
	        System.out.println("Department: " + Department);
	    }
}
 
 class Info{
	 public static void main(String[]args) {
		 Exercise11 s1=new Exercise11("101","Kavya","IT");
		 Exercise11 s2=new Exercise11("102","Oviya","IT");
		 
		 s1.display();
		 s2.display();
	 }
 }

 