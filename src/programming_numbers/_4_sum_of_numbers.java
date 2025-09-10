package programming_numbers;

public class _4_sum_of_numbers {

	
	static void sum_of_numbers(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+= i;
		}
		
		System.out.println("Sum : " + sum);
	}
	
	

	static void sum_of_even_numbers(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				sum+= i;				
			}
		}
		
		System.out.println("Sum : " + sum);
	}
	
	public static void main(String[] args) {
		
	}
}
