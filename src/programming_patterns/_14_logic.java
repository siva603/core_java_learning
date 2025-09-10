package programming_patterns;

import java.util.Scanner;

public class _14_logic {
	
	
	//r=1		1	
	//r=2		2	3
	//r=3		4	5	6
	//r=4		7	8	9	10
	
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
		
		int count = 1;
		
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
