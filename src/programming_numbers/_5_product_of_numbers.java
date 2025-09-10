package programming_numbers;

public class _5_product_of_numbers {
	
	static void sum_of_numbers(int n) {
		int prod = 1;
		for(int i=1;i<=n;i++) {
			prod+= i;
		}
		
		System.out.println("Sum : " + prod);
	}
	
	

	static void sum_of_even_numbers(int n) {
		int prod = 1;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				prod*= i;				
			}
		}
		
		System.out.println("Sum : " + prod);
	}
	
	public static void main(String[] args) {
		
	}
}
