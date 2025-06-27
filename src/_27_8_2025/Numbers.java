package _27_8_2025;

public class Numbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//int temp = a; // temp = 10
		//a = b; // a = 20;
		//b = temp; // b = 10;
		
		a = a + b ; // a = 30;
		b = a - b ; // 30 - 20 -> b = 10;
		a = a - b ; // 30 - 10 -> a = 20;
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);
		
		// ----------------------------------------------
		
		int c = 10 ;
		int d = 20 ;
		
		c = c * d ;  // 10 * 20 = 200
		d = c/d ;   // 200 / 20 = 10;
		c = c/d ;   // 200 / 10 = 20;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		// ---------------------------------------------
		
		int x = 10;
		int y = 20;
		
		x = x ^ y; 
		// 0 1 0 1 0 -> 10
		// 1 0 1 0 0 -> 20
	//	--------------------
	//	   1 1 1 1 0 -> 30 
		
		y = x ^ y;
		x = x ^ y; 
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
		//-------------------------------------------------
		
		int m = 10;
		int n = 20;
		
		m = m+n - (n = m); // 30 - ( 10 ) ==> 20 
		System.out.println("m : "+m);
		System.out.println("n : "+n);
  }
}
