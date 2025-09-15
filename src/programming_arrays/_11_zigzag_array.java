package programming_arrays;

import java.util.Arrays;

public class _11_zigzag_array {

	/**
	 * Q: Write a program to merge two arrays in zigzag fashion.
	 * Example:
	 * arr1 = {1, 3, 5}
	 * arr2 = {2, 4, 6, 8, 10}
	 * Output = {1, 2, 3, 4, 5, 6, 8, 10}
	 */

	
	 public static void zigzagMergeArrays() {
	        int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6, 8, 10};

	        int n1 = arr1.length, n2 = arr2.length;
	        int[] result = new int[n1 + n2];

	        int i = 0, j = 0, k = 0;

	        // Take elements alternately from arr1 and arr2
	        while (i < n1 && j < n2) {
	            result[k++] = arr1[i++];
	            result[k++] = arr2[j++];
	        }

	        // Copy remaining elements of arr1
	        while (i < n1) {
	            result[k++] = arr1[i++];
	        }

	        // Copy remaining elements of arr2
	        while (j < n2) {
	            result[k++] = arr2[j++];
	        }

	        System.out.println("Zigzag Merged Array: " + Arrays.toString(result));
	    }

	    public static void main(String[] args) {
	        zigzagMergeArrays();
	    }
}
