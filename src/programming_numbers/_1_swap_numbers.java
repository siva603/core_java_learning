package programming_numbers;

public class _1_swap_numbers {
	
	static void way1() {
		

		// using 3rd variable 
		
		int a = 10;
		int b = 20;
		
		// code logic for swapping
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
	
	static void way2() {
		

		// without using 3rd variable 
		
		int a = 10;
		int b = 20;
		
		// code logic for swapping
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
	
	static void way3() {
		

		// without using 3rd variable 
		
		int a = 10;
		int b = 20;
		
		// code logic for swapping
		a = a * b;
		b = a / b;
		a = a / b;
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	static void way4() {
		

		// without using 3rd variable
		
		int a = 10;
		int b = 20;
		
		// code logic for swapping
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}
	
	static void way5() {
		

		// without using 3rd variable
		
		int a = 10;
		int b = 20;
		
		// code logic for swapping
		
		a = a+b - ( b = a);
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	public static void main(String[] args) {
	
	}
}
