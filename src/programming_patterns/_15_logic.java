package programming_patterns;

import java.util.Scanner;

public class _15_logic {
	
	
	//r=1		a	
	//r=2		a	b
	//r=3		a	b	c
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
		// find constant value or without constant value, make condition
		// condition is ---> r==c
		
		System.out.println();
		
		
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				
				if(c<=r) {
					System.out.print((char) (96+c) + " ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
