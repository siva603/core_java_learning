package _30_6_2025;

public class _3_static_variable {

	static int a ;
	static int b ;
	
	public static void main(String[] args) {
		int a = 10;
		b = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(_3_static_variable.b + _3_static_variable.a); // className.variable
		System.out.println(_3_static_variable.b + a); // className.variable
		
	}
}
