package programming_patterns;

import java.util.Scanner;

public class _16_logic {

	//r=1		a	
	//r=2		b	c
	//r=3		d	e	f
	//r=4		g	h	i	j
	
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
		
		
		char count = 'a';
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				
				if(c<=r) {
					System.out.print(count++ + " ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
