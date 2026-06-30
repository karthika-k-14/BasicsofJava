package car;

public class Car {
	String Brand;
	String Model;
	int Price;
	public Car(String brand, String model, int price) {
		super();
		Brand = brand;
		Model = model;
		Price = price;
	}
	void display() {
		System.out.println("Brand:" + Brand);
		System.out.println("Model:" + Model);
		System.out.println("Price:" + Price);
		
	}

}
class Info{
	 public static void main(String[]args) {
		 Car c1=new Car("Toyota","Innova",25000000);
		 Car c2=new Car("Hyundii","Creta",4000000);
		 
		 c1.display();
		 c2.display();
	 }
}
