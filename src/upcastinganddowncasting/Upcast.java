package upcastinganddowncasting;

class Parent {
	int a;
	
	void add() {
		System.out.println("parent add method");
	}
	void sub() {
		System.out.println("parent sub method");
	}
}

class Child extends Parent {
	int b;
	
	void add() {
		System.out.println("child add method");
	}
	void sub() {
		System.out.println("child sub method");
	}
	void mul() {
		System.out.println("child mul method");
	}
}





public class Upcast {
	/*
	 * upcasting :
	 * ===========
	 * the process storing child object reference in parent reference variable
	 * is called upcasting
	 * 
	 * Parent p1 = new Child();
	 * 
	 * downcasting :
	 * =============
	 * we should do perform 1st upcasting otherwise you'll get ClassCastException
	 * the process of converting upcasted reference into child class reference.
	 * 
	 */
	
	public static void main(String[] args) {
		
		// p1 = ox1 ( child object address)
		Parent p1 = new Child();
		// p2 = 0x2
		Parent p2 = new Child();
		// p3 = 0x3
		Parent p3 = new Child();
		// p4 = 0x4
		Parent p4 = new Child();
		commonMethod(p1);
		commonMethod(p2);
		commonMethod(p3);
		commonMethod(p4);
		
	}
	
	static void commonMethod(Parent p) {
		// p = ox1
		p.add();
		p.sub();
	}
}
