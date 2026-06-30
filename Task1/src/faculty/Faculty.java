package faculty;

class Faculty{
    private int id;
    private String name;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Faculty f1 = new Faculty();

        f1.setId(101);
        f1.setName("Nithya");
        System.out.println("Faculty ID: " + f1.getId());
        System.out.println("Faculty Name: " + f1.getName());
    }
}