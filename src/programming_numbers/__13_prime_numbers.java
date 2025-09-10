package programming_numbers;

public class __13_prime_numbers {

	
	static boolean isPrime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0)
				return false;
		}
		
		return true;
	}
	
	
	static void printPrimeNumbers(int n, int m) {
		
		for( ; n<=m; n++) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}
	}
	
	static void countPrimeNumbers(int n, int m) {
		
		int count = 0;
		
		for( ; n<=m; n++) {
			if(isPrime(n)) {
				count++;
			}
		}
		System.out.println("count of prime numbers : " + count);
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(12) ? "Prime number" : "not Prime number");
	}
}
