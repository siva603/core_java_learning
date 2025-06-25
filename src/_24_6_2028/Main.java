package _24_6_2028;

public class Main {

	// no -return type  and without parameters
		public static void vara1() { // method called
			System.out.println(50  +90);
		}
	
	
	// no -return type  and with parameters
	public static void vara2(int a,int b) { // method called
		System.out.println(a+b);
	}
	
	// with return type  and without parameters
		public static int vara3() { // method called
			return 10+50;
		}
	
	public static void main(String[] args) {
		
		int a = vara3(); // method calling statement
		System.out.println("result : "+a);
	}
	
	
	
	
	
	
}
