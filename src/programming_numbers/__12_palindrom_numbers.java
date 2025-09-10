package programming_numbers;

public class __12_palindrom_numbers {

	
	static boolean isPalindrom(int n) {
		int temp = n;
		int rev = 0;
		
		while(n!=0) {
			rev = rev * 10 + n%10;
			n/=10;
		}
		return temp == rev;
	}
	
	
	static void printPalindromNumbers(int n, int m) {
		
		for( ; n<=m; n++) {
			if(isPalindrom(n)) {
				System.out.println(n);
			}
		}
	}
	
	static void countPalindromNumbers(int n, int m) {
		
		int count = 0;
		
		for( ; n<=m; n++) {
			if(isPalindrom(n)) {
				count++;
			}
		}
		System.out.println("count of prime numbers : " + count);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrom(121) ? "palindrom number" : "not palindrom number");
	}
}
