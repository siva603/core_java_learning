package programming_numbers;

public class _6_digits_programs {
	
	// n%10 --> it will give last digit only
	// n/1  --> it will remove last digit only
	
	static void printDigitsFromLast(int n) {
		while(n!=0) {
			System.out.println(n%10);
			n = n/10;
		}
	}
	
	static void printCountOfDigits(int n) {
		int count = 0;
		
		while(n!=0) {
			count++;
			n = n/10;
		}
		
		System.out.println("Digits of count : " + count);
	}
	
	static void printDigitsFromFirst(int num) {
		System.out.println("printing digits from 1st ");
		int count = 0;
		
		int n = num;
		
		while(n!=0) {
			count++;
			n = n/10;
		}
		
		// print digits from 1st
		System.out.println("Digits of count : " + count);

		while( num!=0) {
			int div = (int) Math.pow(10,count-1);
			int digit = num / div ;
			System.out.println(digit);
			num = num % div;
			count--;
		}
		
	}

	static void sumOfDigits(int n) {
		int sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		
		System.out.println("Sum of digits : " + sum);
	}
	
	static void prodOfDigits(int n) {
		int prod = 1;
		
		while(n!=0) {
			int digit = n%10;
			prod = prod * digit;
			n = n/10;
		}
		
		System.out.println("prod of digits : " + prod);
	}
	
	static void sumEvenOfDigits(int n) {
		int sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			if(digit%2==0) {
				sum = sum + digit;
			}
			n = n/10;
		}
		
		System.out.println("Sum of digits : " + sum);
	}
	
	public static void main(String[] args) {
		
		printDigitsFromFirst(1234);
	}
	
	
	
	
}
