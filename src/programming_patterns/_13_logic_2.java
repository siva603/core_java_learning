package programming_patterns;

import java.util.Scanner;

public class _13_logic_2 {


	
	
	//r=1		1 	5	9	12
	//r=2		2	6	10	13
	//r=3		3	7   11  14
	//r=4		4   8   15  15
	
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
		
		for(int r=1; r<=n; r++) {
			int count = r;
			for(int c=1; c<=n; c++) {
				System.out.print(count + "   ");
				count = count + n;
			}
			System.out.println();
		}
		
		
		
	}
}
