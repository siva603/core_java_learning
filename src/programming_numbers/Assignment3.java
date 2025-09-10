package programming_numbers;

public class Assignment3 {
	
	static int findMaxDigit(int n) {
		int max =n%10;
		n = n/10;
		while(n!=0) {
			if(max < n%10)
				max = n%10;
			n/=10;
		}
		return max;
	}
	
	static int count(int n) {
		return n!=0? 1+count(n/10) : 0;
	}
	
	static int removeDigit(int n,int digit) {
		int c = count(n);
		int pow = (int) Math.pow(10, c-1);
		int res = 0;
		while(n!=0) {
			int d = n/pow; // getting 1st digit;
			if(digit == d) {
				n%=pow;
				pow /= 10;
				continue;
			}
			res = res*10 + d;
			n%=pow;
			pow /= 10;
		}
		return res;
	}
	
	static int addFirst(int digit , int n) {
		int pow = (int) Math.pow(10,count(n));
		digit *= pow;
		digit +=n;
		return digit;
	}
	

	public static void main(String[] args) {
		int n = 12532;
		
		// 1st find max digit
		int d = findMaxDigit(n);
		System.out.println("max : "+d);
		// remove max digit
		n = removeDigit(n, d);
		System.out.println("removed number : "+n);
		// add in 1st 
		n = addFirst(d, n);
		System.out.println("result : "+n);
	}
}
