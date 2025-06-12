package _8_6_2025;

import java.util.Scanner;

public class practice_7 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int a = s.nextInt();
		
		System.out.println("Enter b value : ");
		int b = s.nextInt();
		
		System.out.println("Enter c value : ");
		int c = s.nextInt();
		
		int res = a<b && a<c ? a : b < c ? b : c ;
		
		System.out.println("min value : "+res);
		
	}
}
