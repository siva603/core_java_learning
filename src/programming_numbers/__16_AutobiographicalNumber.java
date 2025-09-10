package programming_numbers;

public class __16_AutobiographicalNumber {
	

	// num = 2020
	
	// count of digits = 4;
	
	// 0 < 4 and count of '0' in 2020 --> 2
	// 1 < 4 and count of '1' in 2020 --> 0
	// 2 < 4 and count of '2' in 2020 --> 2
	// 3 < 4 and count of '3' in 2020 --> 0
									//	--------
									//	 2020
	
	// 4 < 4 condition fail
	
	
	static boolean isAutobiographicalNumber(int n) {
		int res=0,countOfDigits = countDigits(n);

		for(int i=0;i<countOfDigits;i++) {
			int cf = countFrequency(n, i);
			res = res * 10 + cf;
		}
		return n == res;
	}
	
	static int countFrequency(int n,int k) {
		int frequency = 0;
		while(n!=0) {
			if( k == n%10)
				frequency++;
			n/=10;
		}
		return frequency;
	}
	
	static int countDigits(int n) {
		int c = 0;
		for(;n!=0;n/=10)
			c++;
		return c;
	}
	
	public static void main(String[] args) {
		int n = 2020;
		int n1 = 12;
		System.out.println(isAutobiographicalNumber(n)==true ? n+" is autobiographical number ":n+" is not autobiographical number");
		System.out.println(isAutobiographicalNumber(n1)==true ? n1+" is autobiographical number ":n1+" is not autobiographical number");
	}

}
