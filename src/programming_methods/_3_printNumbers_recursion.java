package programming_methods;

public class _3_printNumbers_recursion {

	static void printNumbersFromLast(int n) {
		
		//base condition
		if(n==0)
			return;
		
		// print statments
		System.out.println(n);
		
		// recursion call
		printNumbersFromLast(n-1);
		
	}
	
	static void printNumbersFromFirst(int n) {
		
		//base condition
		if(n==0)
			return;
		
		// recursion call
		printNumbersFromFirst(n-1);
		
		// print statments
		System.out.println(n);
		
	}
	
	
	static void printDigits(int n) {
		
		//base condition
		if(n==0)
			return;
		
		// print statments
		System.out.println(n%10);
		
		// recursion call
		printNumbersFromLast(n/10);
		
	}
	
	static int countDigits(int n) {
		
		//base condition
		if(n==0)
			return 0;
		
		// recursion call
		return 1 + countDigits(n/10);
		
	}
	
	static int countDigits2(int n) {
		return n == 0 ? 0 : 1 + countDigits2(n/10);
	}
	
	static int countEvenDigits(int n) {
		
		//base condition
		if(n==0)
			return 0;
		
		// recursion call
		int digit = n%10;
		if(digit%2==0)
			return 1 + countEvenDigits(n/10)
		else
			return countEvenDigits(n/10);
		
	}
	
	static int countEvenDigits2(int n) {
		return n == 0 ? 0 : ((n%10)%2==0) ? 1 + countEvenDigits2(n/10) : countEvenDigits2(n/10);
	}
	
	public static void main(String[] args) {
		
	}
	
}
