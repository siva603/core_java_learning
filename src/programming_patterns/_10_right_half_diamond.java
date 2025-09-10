package programming_patterns;

import java.util.Scanner;

public class _10_right_half_diamond {
	
	
	//r=1	*	
	//r=2	*	*	
	//r=3	*	*	*
	//r=4	*	*	*	*
	//r=5	*	*	*
	//r=6	*	*	
	//r=7	*	
	
	//      1   2   3   4	
	// columns values

	public static void main(String[] args) {
		
		// take from n value from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		
		// find row value 
		// find col value
		// find constant value or without constant value, make condition
		// condition is ---> c==r and r+c
		
		System.out.println();
		
		for(int r=1; r<=n*2-1; r++) {
			
			for(int c=1; c<=n*2-1; c++) {
				
				if(c<=r && c+r<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
