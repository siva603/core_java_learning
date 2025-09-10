package programming_numbers;

public class _8_xylem_or_pholem_number {

	public static void main(String[] args) {
		
		// sum of exstreme digits == sum of mean digits
		
		int n = 1234;
		int temp = n;
		int sumOfExstrem = 0; // 1 + 4 = 5
		int sumOfMean = 0; // 2 + 3 = 5
		
		while(temp!=0) {
			int d = n%10;
			if(temp==n || temp < 10) {
				sumOfExstrem+=d;
			}else {
				sumOfMean+=d;
			}
			temp/=10;
		}
		
		System.out.println(sumOfExstrem == sumOfMean ? "xylem number " : "pholem number");
		}
}
