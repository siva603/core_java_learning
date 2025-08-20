package _2_7_2025;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		// take input  from user and store
		
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
				
		double result = doubleDouble(a);
		
		System.out.println(result);
	}

	public static double doubleDouble(double a) {
		
		return a * 2;
		
	}
	
	
}
