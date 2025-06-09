package _8_6_2025;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10, b= 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("----------------------------");
		
		
		// ASSIGNMENT OPERRATOR
		
		int c =0;
		System.out.println(c=c+a);
		System.out.println(c+=a);
		System.out.println(c);
		
		
		System.out.println("----------------------------");
		// TERNARY
		
		int y = 20, z=20;
		int res = y < z ? y : z ;
		System.out.println(res);
		
		System.out.println("----------------------------");

		int v = 10;
		
		System.out.println(v); // 10
		
		System.out.println(v++);// 10 --> 11
		System.out.println(++v);// 12 
		
		System.out.println(v); // 12
		
		System.out.println(v--); // 12 --> 11
		System.out.println(--v); // 10 
		
		System.out.println("----------------------------");

	}
}
