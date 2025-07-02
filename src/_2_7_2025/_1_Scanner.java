package _2_7_2025;

import java.util.Scanner;

public class _1_Scanner {
	
	/*
	 * Scanner is predefined class present in java.util package.
	 * it is used to take input from user.
	 * 
	 * Scanner is predefined non static methods for taking input
	 * 
	 * if you want to take byte input from users
	 * 	
	 * 1st we should create object for Scanner class
	 * 
	 * Scanner obj = new Scanner(); // syntax
	 * 
	 * byte   -> obj.nextByte();
	 * short  -> obj.nextShort();
	 * int    -> obj.nextInt();
	 * long   -> obj.nextLong();
	 * 
	 * float  -> obj.nextFloat();
	 * double -> obj.nextDouble();
	 * 
	 * String  -> obj.next(); // only take input only one word -> "siva"
	 * String  -> obj.nextLine() // it takes total line;
	 * 
	 * char    -> obj.next().charAt(0) // it takes only 1st character of String
	 * 
	 * boolean -> obj.nextBoolean();
	 * +
	 * +
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String a = sc.nextLine();
		System.out.println("Enter b Name ");
		String b = sc.next();
		
		System.out.println("user input : "+a);
		System.out.println("user input : "+b);
		
	}
}
