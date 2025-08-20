package _14_07_2025;

public class Laptop {

	int id;
	String brand;
	Laptop(int id,String brand){
		this.id = id;
		this.brand = brand;
	}
	
	void display() {
		System.out.println(this.id);
		System.out.println(this.brand);
	}
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop(1,"hp");
		l1.display();
		
	}
}
