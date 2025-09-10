package programming_numbers;

import java.util.Scanner;

public class __18_PowerOfTwo {
	
	static boolean isPowerOf2(int n) {
		int p=2;
		while(true) {
			if(p==n)
				return true;
			if(p > n)
				return false;
			p = p*2;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println(isPowerOf2(n));
	}
}
