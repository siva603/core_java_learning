package programming_patterns;

import java.util.Scanner;

public class _11_alphabit_square {

	
	//r=1		a	b	c	d
	//r=2		a	b	c	d
	//r=3		a	b	c	d
	//r=4		a	b	c	d

	
	//      	1   2   3   4
	// columns values


	public static void main(String[] args) {
		
		// take from n value from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		
		// find row value 
		// find col value
		// find constant value and make condition
		
		System.out.println();
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				System.out.print( (char)(96 + c) + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
