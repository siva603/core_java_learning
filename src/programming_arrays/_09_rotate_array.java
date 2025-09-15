package programming_arrays;
import java.util.*;
public class _09_rotate_array {


    // Question: Given an integer array numbers, rotate the array to the right by k steps.
    public static void rotateArrayRight() {
    	
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3; // number of steps to rotate

        // Handle case when k > n
        k = k % n;

        while ( k > 0) {
        	int t = arr[n-1];
        	
        	for(int i = n-2; i>=0;i--) {
        		arr[i+1] = arr[i];
        	}
        	arr[0] = t;
        }

        System.out.println("Rotated Array (Right by " + k + " steps): " + Arrays.toString(arr));
    }


    
    
    public static void rotateArrayRightBestWay() {
    	
//    	Steps (Rotate Right by k)
//		-----------------------
    	
//    	Reverse the entire array.
//
//    	Reverse the first k elements.
//
//    	Reverse the remaining n-k elements.
    	
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3; // non-negative steps

        // Handle case when k > n
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        System.out.println("Rotated Array (Right by " + k + " steps): " + Arrays.toString(arr));
    }


    // Helper function to reverse part of an array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    // Left rotation by k steps using reversal algorithm
    public static void rotateArrayLeft() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3; // steps to rotate left

        // Handle case when k > n
        k = k % n;

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array (Left by " + k + " steps): " + Arrays.toString(arr));
    }

    
    
    public static void main(String[] args) {
        rotateArrayRight(); // normal way 
        
        
    }
}
