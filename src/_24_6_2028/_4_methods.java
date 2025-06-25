package _24_6_2028;

public class _4_methods {
	
	// without return type and without parameters\
	static void add() { // parameters
		// addition
		int a = 10;
		int b = 20;
		int res = a + b;
		System.out.println(res);
	}
	
	// with return type and without parameters
	static int add1() { // parameters
		// addition
		int a = 10;
		int b = 20;
		int res = a + b;
//		System.out.println(res);
		return res;
	}
	
	// without return type and with parameters
	static void add3(int a , int b) { // parameters
		// addition
		int res = a + b;
		System.out.println(res);
	}
	
	// with return type and with parameters
	static int add4(int a , int b) { // parameters
		// addition
		int res = a + b;
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		
		add();
		
		int res1 = add1();
		System.out.println(res1);
		
		add3(10,40);
		
		int res = add4(10,50); 
		System.out.println(res);
		
		
		System.out.println("end");
	}
	
}
