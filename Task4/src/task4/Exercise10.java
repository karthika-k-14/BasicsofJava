package task4;

public class Exercise10 {
    public static void main(String[] args) {

        String rollNo = "101";
        String age = "19";
        String mobile = "9876543210";
        String cgpa = "8.7";
        char section = 'A';

        boolean valid = true;

        try {
            int roll = Integer.parseInt(rollNo);
            int ageValue = Integer.parseInt(age);
            double cgpaValue = Double.parseDouble(cgpa);

            boolean isLetter =
                    Character.isLetter(section);

            boolean mobileValid = true;

            for(char ch : mobile.toCharArray()) {
                if(!Character.isDigit(ch)) {
                    mobileValid = false;
                    valid = false;
                    break;
                }
            }

            System.out.println("Roll No: " + roll);
            System.out.println("Age: " + ageValue);
            System.out.println("CGPA: " + cgpaValue);
            System.out.println("Section is Letter: " + isLetter);
            System.out.println("Mobile Number Valid: " + mobileValid);
            System.out.println("Lowercase Section: "
                    + Character.toLowerCase(section));
            System.out.println("Uppercase Section: "
                    + Character.toUpperCase(section));

            String ageString = String.valueOf(ageValue);

            if(valid)
                System.out.println("Student Details Valid");
            else
                System.out.println("Student Details Invalid");

        }
        catch(NumberFormatException e) {
            System.out.println("Invalid Number Conversion");
        }
    }
}