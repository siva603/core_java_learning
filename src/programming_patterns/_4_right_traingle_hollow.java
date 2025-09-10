package programming_patterns;

import java.util.Scanner;

public class _4_right_traingle_hollow {
	
	
	//r=1		*	
	//r=2		*	*
	//r=3		*		*
	//r=4		*	*	*	*
	
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
		// condition is ---> c==r || c==1 || r==n
		
		System.out.println();
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				
				if(c==r || c==1 || r==n) {
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
