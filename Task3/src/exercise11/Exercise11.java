package exercise11;

public class Exercise11 {
    public static void main(String[] args) {
        String name = "  arul antran vijay  ";
        String email = "arul@company.com";
        String department = "Computer Science";
        String trimmedName = name.trim();
        System.out.println("Trimmed Name: " + trimmedName);
        System.out.println("Uppercase: " + trimmedName.toUpperCase());
        System.out.println("Lowercase: " + trimmedName.toLowerCase());
        System.out.println("Length: " + trimmedName.length());
        if (email.endsWith("@company.com")) {
            System.out.println("Email belongs to company domain");
        } else {
            System.out.println("Email does NOT belong to company domain");
        }
        if (trimmedName.toUpperCase().startsWith("A")) {
            System.out.println("Name starts with A");
        } else {
            System.out.println("Name does NOT start with A");
        }
        System.out.println("First occurrence of 'a': " + trimmedName.indexOf('a'));
        System.out.println("Replace spaces: " + trimmedName.replace(" ", "_"));
        System.out.println("First 4 characters: " + trimmedName.substring(0, 4));
        String anotherDept = "Computer Science";
        if (department.equals(anotherDept)) {
            System.out.println("Departments are equal");
        } else {
            System.out.println("Departments are not equal");
        }
    }
}