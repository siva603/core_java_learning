package programming_methods;

public class _1_greatest_number {

	
	static int greatestNumber(int a, int b) {
		return a > b ? a : b;
	}
	
	static int greatestNumber(int a, int b, int c) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(greatestNumber(3, 13));
	}
}
