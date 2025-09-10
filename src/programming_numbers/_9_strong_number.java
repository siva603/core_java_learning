package programming_numbers;

public class _9_strong_number {

	static int factorial(int n) {
		int prod = 1;
		
		for(int i=2; i<=n; i++) {
			prod *= i;
		}
		
		return prod;
	}
	
	
	static void eachDigitFactorial(int num) {
		
		while(num!=0) {
			int digit = num%10;
			System.out.println(factorial(digit));
			num/=10;
		}
		
	}
	
	
	static boolean isStrongNumber(int num) {
		
		// sum of factorial of digits equal to number it self
		// num = 1234
		// num == 1! + 2! + 3! + 4!
		
		int temp = num;
		int sum = 0;
		
		while(num!=0) {
			int digit = num%10;
			sum = sum + factorial(digit);
			num/=10;
		}
		
		return temp == sum;
	}
	
	public static void main(String[] args) {
		
		// find factorial of number
//		System.out.println(factorial(5));
		
		// each digit of factorials
//		eachDigitFactorial(1234);
		
		System.out.println(isStrongNumber(152) ? "strong number" : "not strong number");
	}
}
