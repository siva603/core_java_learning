package programming_patterns;

import java.util.Scanner;

public class _7_half_diamond {

	
	
	//r=1				*	
	//r=2			*	*	*	
	//r=3		*	*	*	*	*
	//r=4	*	*	*	*	*	*	*
	
	//      1   2   3   4	5	6	7
	// columns values

	public static void main(String[] args) {
		
		// take from n value from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		
		// find row value 
		// find col value
		// find constant value or without constant value, make condition
		// condition is ---> c+r and c-r
		
		System.out.println();
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n*2-1; c++) {
				
				if(c+r>=n+1 && c-r<=n-1) {
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
