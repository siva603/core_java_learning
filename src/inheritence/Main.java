package inheritence;


class Vehical {

	int wheel;
	
	public Vehical(int wheel) {
		this.wheel = wheel;
	}
}

class Car extends Vehical{
	String model;
	public Car(int wheel,String model) {
		// super is keyword
		// super is stored the immediate parent object address
		
		super(wheel); // parent constrcutors call 
		this.model = model;
	}

}


public class Main {

	public static void main(String[] args) {
		// parent object creation
		Vehical v1 = new Vehical(2);
		System.out.println(v1.wheel);
		
		
		// child object creation
		// 1st parent object create avuthindhi
		// 2nd child object create avuthundhi
		
		Car c1 = new Car(4,"2025 model");
		System.out.println(c1.wheel);
		System.out.println(c1.model);
		
	}
	
}


