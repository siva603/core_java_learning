package programming_numbers;

import java.util.Random;
import java.util.Scanner;

public class __19_RandomNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
		int ranNumber = random.nextInt(1,101);
		
		for(int i=1;i<=10;i++) {
			System.out.print("\nEnter a number guess the value from 1 to 100 --> : ");
			int n = s.nextInt()	;
			if(n==ranNumber) {
				System.out.println("you guessed right");
				return;
			}
			if(ranNumber > n)
				System.out.println("you entered less value try again ");
			else
				System.out.println("you entered hight value try again");
		}
		
		System.out.println("Game over all guessed wrong values");
	}
}
