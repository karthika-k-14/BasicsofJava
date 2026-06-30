package students;

class Students{
    int id;
    String name;
    Students(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
    public static void main(String[] args){
        Students s1 = new Students(101, "Karthika");
        s1.display();
    }
}