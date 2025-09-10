package programming_patterns;

import java.util.Scanner;

public class _19_logic {

	
	//r=1				a	
	//r=2			a	b	a	
	//r=3		a	b	c	b	a
	//r=4	a	b	c	d	c	b	a
	
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
			char count = 'a';
			for(int c=1; c<=n*2-1; c++) {
				
				if(c+r>=n+1 && c-r<=n-1) {
					char res = c < n ? count++ : count--;
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
