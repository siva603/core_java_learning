package programming_numbers;

import java.util.Scanner;

public class __11_arm_strong_number {

	static int power(int base, int exp) {
		int prod = 1;
		for(;exp>=1;exp--) {
			prod = prod * base;
		}
		return prod;
	}
	
	static int count(int n) {
		int c = 0;
		while(n!=0) {
			c++;
			n/=10;
		}
		return c;
	}
	
	
	static boolean isArmStrongNumber(int n) {
		// sum of individual digits power raise to the count of digits is equal to number it self.
		
		// n = 143 
		// count of digits = 3
		
		// n == 1^3 + 4^3 + 3^3
		int temp = n;
		int count = count(n);
		
		int sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			
			sum = sum + power(digit, count);
			
			n/=10;
		}
		
		return temp == sum;
	}
	
	
	static void printArmStrongNumbersRange() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter staring value : ");
		int start = s.nextInt();
		System.out.println("Enter staring value : ");
		int end = s.nextInt();
		for(;start<=end;start++) {
			if(isArmStrongNumber(start))
				System.out.println(start);
		}
	}
	
	public static void main(String[] args) {
		
		// 
//		System.out.println(power(2,3));
		
		System.out.println(isArmStrongNumber(153) ? "Arm Strong number" : "not Arm strong number");
	}
}
