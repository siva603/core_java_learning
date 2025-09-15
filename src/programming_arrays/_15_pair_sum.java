package programming_arrays;

public class _15_pair_sum {

    // Question: Check if there exists at least one pair in the array whose sum is equal to K.
    //
    // Example:
    // Input: arr = {2, 4, 3, 5, 7, 8, 1}, K = 9
    // Output: true (because pairs like (2,7) exist)
    
    public static boolean hasPairWithSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;  // Pair exists
                }
            }
        }
        return false;  // No pair found
    }

    
    
    
	// Question: Find all pairs in the array whose sum is equal to a given value K.
    //
    // Example:
    // Input: arr = {2, 4, 3, 5, 7, 8, 1}, K = 9
    // Possible pairs: (2, 7), (4, 5), (8, 1)
    // Output:
    // Pair found: (2, 7)
    // Pair found: (4, 5)
    // Pair found: (8, 1)
    public static void findPairsEqualToK(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 1};
        int k = 9;

        // Print all pairs
        findPairsEqualToK(arr, k);

        // Check if any pair exists
        boolean exists = hasPairWithSum(arr, k);
        System.out.println("Does any pair exist? " + exists);
    }
}
