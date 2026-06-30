package person;

class Person{
    void display(){
        System.out.println("This is Person Class");
    }
}
class Student extends Person{
    void studentInfo(){
        System.out.println("Student Class");
    }
}
class Faculty extends Person{
    void facultyInfo(){
        System.out.println("Faculty Class");
    }
}
class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Faculty f1 = new Faculty();
        s1.display();
        s1.studentInfo();
        f1.display();
        f1.facultyInfo();
    }
}