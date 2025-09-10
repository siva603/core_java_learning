package programming_numbers;

import java.util.Scanner;

public class _8_harshad_number {

	// if sum of digits is divisible with number it self is called harshad number
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(n!=0) {
			sum+= n%10;
			n/=10;
		}
		
		System.out.println(n%sum==0 ? "Harshad number" : "not a Harshad number");
		
	}
}
