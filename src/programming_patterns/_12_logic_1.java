package programming_patterns;

import java.util.Scanner;

public class _12_logic_1 {

	
	
	//r=1		1 	2	3	4
	//r=2		5	6	7	8
	//r=3		9	10  11  12
	//r=4		13  14  15  16
	
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
		int count=1;
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				System.out.print(count++ + "   ");
			}
			System.out.println();
		}
		
		
		
	}
}
