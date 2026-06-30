package employees;

class Employees{
    int empId;
    String empName;
    double salary;
    Employees(){
        System.out.println("Default Constructor");
    }
    Employees(int id){
        empId = id;
        System.out.println("Employee ID: " + empId);
    }
    Employees(int id, String name, double sal){
        empId = id;
        empName = name;
        salary = sal;
    }
    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args)
    {
        Employees e1 = new Employees();
        Employees e2 = new Employees(101);
        Employees e3 = new Employees(102, "Ravi", 50000);
        e3.display();
    }
}