package task;

interface College {
    String collegeName = "KCE";
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }
}
class CollegeStudent implements College {
    int rollNo;
    String name;
    CollegeStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        College.displayCollege();
        CollegeStudent s = new CollegeStudent(101, "Arul");
        s.displayStudent();
    }
}