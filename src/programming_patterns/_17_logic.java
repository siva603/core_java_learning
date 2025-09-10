package programming_patterns;

import java.util.Scanner;

public class _17_logic {

	
	//r=1				1	
	//r=2			1	2	1	
	//r=3		1	2	3	2	1
	//r=4	1	2	3	4	3	2	1
	
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
			int count = 1;
			for(int c=1; c<=n*2-1; c++) {
				
				if(c+r>=n+1 && c-r<=n-1) {
					int res = ( c < n ) ? count++ : count-- ;
					System.out.print(res + " ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}
}
