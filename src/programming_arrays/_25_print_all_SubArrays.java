package programming_arrays;

public class _25_print_all_SubArrays {

    // Question: Given an integer array, print all possible subarrays in a simple way.
    //
    // Example:
    // Input: arr = {1, 2, 3}
    // Output:
    // 1
    // 1 2
    // 1 2 3
    // 2
    // 2 3
    // 3

    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
        	
            for (int end = start; end < n; end++) {
            	
            	// starting and ending indeces 
            	
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                
                System.out.println(); // move to next line after subarray
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("All Subarrays:");
        printAllSubarrays(arr);
    }
}

