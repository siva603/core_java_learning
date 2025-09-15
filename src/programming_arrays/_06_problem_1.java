package programming_arrays;
import java.util.*;

public class _06_problem_1 {

	/*
	 * Given integer array isze n find out smallest sub array length that should 
	 * contains min and max elements
	 * 
	 * 
	 * 
	 * Approach

		First, find the global minimum and global maximum values in the array.
		
		Traverse the array while keeping track of the latest positions of min and max.
		
		Whenever both min and max are found, calculate the subarray length (abs(i - j) + 1).
		
		Keep track of the smallest such length.

	 * 
	 */
	
	
	public static void smallestSubarrayWithMinMaxNested() {
        int[] arr = {1, 5, 9, 2, 3, 9, 1, 4};
        int n = arr.length;

        // Step 1: Find global min and max
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Edge case: all elements same
        if (min == max) {
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Smallest Subarray Length = 1");
            return;
        }

        int minLength = n;

        // Step 2: Nested loop approach
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                // search forward for min
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == min) {
                        minLength = Math.min(minLength, j - i + 1);
                        break; // stop after finding nearest min
                    }
                }
            } else if (arr[i] == min) {
                // search forward for max
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == max) {
                        minLength = Math.min(minLength, j - i + 1);
                        break; // stop after finding nearest max
                    }
                }
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Minimum Element = "	 + min);
        System.out.println("Maximum Element = " + max);
        System.out.println("Smallest Subarray Length = " + minLength);
    }



    public static void main(String[] args) {
        smallestSubarrayWithMinMaxNested();
    }	
}
