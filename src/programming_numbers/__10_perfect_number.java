package programming_numbers;

public class __10_perfect_number {


	static int factors(int n) {
		int sum = 0;
		
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println(i+" ");
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	
	
	
	static boolean isPerfectNumber(int num) {
		
		// sum of factorial of digits equal to number it self
		// num = 6
		// num == 1 + 2 + 3 ( true)
		
		return num == factors(num);
	}
	
	public static void main(String[] args) {
		
		// find factorial of number
//		System.out.println(factors(5));

		
		System.out.println(isPerfectNumber(6) ? "perfect number" : "not perfect number");
	}
}
