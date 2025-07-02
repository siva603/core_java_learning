package _30_6_2025;

public class _1_StaticMethod {

	static int a = 5;
	static int b;
	
	
	static void add(int a , int b ) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(_1_StaticMethod.a+b);
	}
	
	public static void main(String[] args) {
		
	_1_StaticMethod.add(10,20);
	System.out.println(_1_StaticMethod.a);
	
	}
}
