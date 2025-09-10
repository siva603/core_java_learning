package programming_numbers;

import java.util.Scanner;

public class __17_FindNearestPalindromNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println("nearest palindrom number : "+findNearestNumber(n));
	}

	 static int findNearestNumber(int n) {
		
		 if(isPalindrom(n))
			 return n;
		 for(int in = n+1,de=n-1;;in++,de--) {
			 if(isPalindrom(in))
				 return in;
			 if(isPalindrom(de))
				 return de;
		 }
	}
	 
	 static boolean isPalindrom(int n) {
		 int res = 0;
		 
		 for(int i=n;i!=0;i/=10){
			 res = res*10 + i%10;
		 }
		 
		 return res == n;
	 }
	
}
