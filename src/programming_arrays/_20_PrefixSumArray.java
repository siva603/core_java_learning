package programming_arrays;
import java.util.Arrays;

public class _20_PrefixSumArray {

    // Method 1: Using extra array
    // Question: Given an integer array, create a prefix sum array using an extra array
    // and print it.
    //
    // Example:
    // Input: arr = {1, 2, 3, 4, 5}
    // Output: Prefix Sum Array: [1, 3, 6, 10, 15]
	
	
    public static void printPrefixSumWithExtraArray(int[] arr) {
        int n = arr.length;
        
        int[] prefix = new int[n]; // extra array to store prefix sums

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum Array (Extra Array): " + Arrays.toString(prefix));
    }

    
    
    // Method 2: In-place prefix sum
    // Question: Given an integer array, convert it into a prefix sum array
    // by updating the original array itself.
    //
    // Example:
    // Input: arr = {1, 2, 3, 4, 5}
    // Output: arr = {1, 3, 6, 10, 15}
    
    
    public static void prefixSumInPlace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println("Prefix Sum Array (In-place): " + Arrays.toString(arr));
    }
    
    

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        printPrefixSumWithExtraArray(arr1); // using extra array

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr2));
        prefixSumInPlace(arr2); // in-place modification
    }
}
