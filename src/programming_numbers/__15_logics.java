package programming_numbers;

public class __15_logics {

	
	// average of digits
	static void avgOfDigits(int num) {
		
		int sum = 0;
		int count = 0;
		while(num!=0) {
			sum+=num%10;
			count++;
			num/=10;
		}
		System.out.println("Avg of digits : " + (sum/count));
	}
	
	
	// zigzag pattern 
	// n1 = 123
	// n2 = 4567
	// res = 1425367
	
	static void zigzag(int n1, int n2) {
		int res = 0;
		while(n1!=0 && n2!=0) {
			res = res*10 + n1%10;
			res = res*10 + n2%10;
			n1/=10;
			n2/=10;
		}
		
		while(n1!=0) {
			res = res*10 + n1%10;
			n1/=10;
		}
		
		while(n2!=0) {
			res = res*10 + n2%10;
			n2/=10;
		}
		
		System.out.println("Zigzag result : " + res);
	}
	
	
	// find given number is unique number or not
	// if the number doesn't repeat any digits in that number 
	// we can say that number is unique number 
	
	static boolean isUniqueNumber(int n) {
		// n = 123
		
		while(n!=0) {
			int d =  n%10; // d = 1
			int temp = n/10; // temp = 23
			
			// now checking the digit is present or not 
			
			while(temp!=0) {
				if(temp%10 == d)
					return false;
				temp/=10;
			}
			
		}
		return true;
	}
	
	
	
	
}
