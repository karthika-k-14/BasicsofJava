package employee;

class Employee
{
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayInfo()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args)
    {
        Employee emp1 = new Employee(101, "Ravi", 50000);

        emp1.displayInfo();
    }
}