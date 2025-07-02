package _30_6_2025;

public class _1_StaticBlocks {

	static int a;
	
	static {
		System.out.println("static block 2");
		int a = 10; // local variable
		System.out.println(a); // local variable
	}
	
	
	public static void main(String[] args) {
		// local variable not present
		System.out.println("main method");
		System.out.println(a);
	}
	
	static {
		System.out.println("static block 1");
		a = 20;
	}
	
	
}
