package programming_numbers;

public class Assigment5 {
	
	static double SumOfPrimeElements(int[] a) {
		int sum=0;int count =0;
		for(int ele : a)
			if(isPrime(ele)) {
				sum+=ele;count++;
			}
		System.out.println("count : "+count);
		System.out.println("sum : "+sum);
		return sum/count;
	}
	
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		System.out.println(" array prime elements sum : "+SumOfPrimeElements(a));
	}

	private static boolean isPrime(int a) {
		int count = 0;
		for(int i = 2; i<=a/2;i++)
			if(a%i==0)
				return false;
		return true;
	}
}
