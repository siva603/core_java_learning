package programming_patterns;

import java.util.Scanner;

public class _14_logic2 {

	//r=1		0	
	//r=2		1	0
	//r=3		1	0	1
	//r=4		0	1	0	1
	
	//      	1   2   3   4
	// columns values
	
	
	//r=1		1	
	//r=2		2	3
	//r=3		4	5	6
	//r=4		7	8	9	10

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
					int res = (count++ % 2 == 0) ? 1 : 0;
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
