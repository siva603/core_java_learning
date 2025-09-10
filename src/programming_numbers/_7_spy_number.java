package programming_numbers;

import java.util.Scanner;

public class _7_spy_number {

	// if sum of digits is equal to product of digits that number called spy number
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		
		while(n!=0) {
			sum+= n%10;
			prod*=n%10;
			n/=10;
		}
		
		System.out.println(sum == prod ? "spy number" : "not a spy number");
		
	}
}
