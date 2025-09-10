package programming_numbers;

public class _3_count_programs {

	static void count_numbers_N_M(int n, int m) {
		
		int count = 0;
		for(; n<=m ; m++) {
			count++;
		}
		System.out.println("count : " + count);
	}
	
	
	static void count_even_numbers(int n, int m) {
		
		int count = 0;
		for(; n<=m ; m++) {
			
			if(n%2==0)
				count++;
		}
		System.out.println("count : " + count);
	}
	
	static void count_odd_numbers(int n, int m) {
		
		int count = 0;
		for(; n<=m ; m++) {
			
			if(n%2==1)
				count++;
		}
		System.out.println("count : " + count);
	}
	

public static void main(String[] args) {
	
	
	
}
	
	
}
