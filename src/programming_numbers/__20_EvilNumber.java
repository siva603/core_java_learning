package programming_numbers;

public class __20_EvilNumber {
	static boolean isEvil(int n) {
		if(n<10 && n==1)
			return true;
		int count = 0;
		for(;n!=0;n/=10)
			if(n%10==1) 
				count++;
		return count%2==1;
	}
	public static void main(String[] args) {
		System.out.println(isEvil(112321));
		System.out.println(isEvil(1));
		System.out.println(isEvil(11));
	}
}
