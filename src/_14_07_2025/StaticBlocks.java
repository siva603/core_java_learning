package _14_07_2025;

public class StaticBlocks {

	static int a;
	
	static void vara() {
		System.out.println("vara is cute...");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main method start");
		StaticBlocks.vara();
		System.out.println("Main method end");
	}
	static {
		System.out.println("static block 1");
	}
	
}
