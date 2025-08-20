package interfaces;

/*
 * -> interface is keyword
 * -> interface is used 
 */

interface Calculator {
	
	public static final int a = 10;
	int b = 20;
	
	public abstract void add();
	void sub();
	
	static void display() {
		// in java 1.8 static concrete methods are allowed in interface
		System.out.println(a);
	}
}

class Child1 implements Calculator {
	
	public void add() {
		System.out.println("child 1");
	}
	public void sub() {
		System.out.println("child 2");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		
		c1.add();
		c1.sub();
	}
}
