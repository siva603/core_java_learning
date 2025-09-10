package programming_numbers;

public class Assignment6 {

	static double oddElementSum(int[] a) {
		int sum=0;int count =0;
		for(int ele =0;ele<a.length;ele++)
			if(ele%2==1) {
				sum+=a[ele];count++;
			}
		System.out.println("count : "+count);
		System.out.println("sum : "+sum);
		return sum/count;
	}
	
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6,7,8};
		System.out.println(" array odd index elements sum : "+oddElementSum(a));
	}
}
