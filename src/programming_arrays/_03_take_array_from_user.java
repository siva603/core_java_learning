package programming_arrays;
import java.util.Scanner;
import java.util.Arrays;

public class _03_take_array_from_user {

	    public void takeInputAndPrint() {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Take array size
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        // Step 2: Create array
	        int[] numbers = new int[size];

	        // Step 3: Take values from user
	        System.out.println("Enter " + size + " values:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        System.out.println("\nPrinting array in different built-in ways:");

	        // Using Arrays.toString()
	        System.out.println(Arrays.toString(numbers));


	        sc.close();
	    }
	
}
