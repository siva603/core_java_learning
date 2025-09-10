package programming_numbers;

public class Assignment7 {
	static double evenElementSum(int[] a) {
		int sum=0;int count =0;
		for(int ele =0;ele<a.length;ele++)
			if(ele%2==0) {
				sum+=a[ele];count++;
			}
		System.out.println("count : "+count);
		System.out.println("sum : "+sum);
		return sum/count;
	}
	
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6,7,8};
		System.out.println(" array even index elements sum : "+evenElementSum(a));
	}
}
