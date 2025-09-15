package programming_arrays;

public class _28_LargestSubarraySum {

    // Question: Given an integer array, return the sum of the subarray
    // with the largest sum.
    //
    // Example:
    // Input: arr = {4, -1, 2, 1}
    // Output: 6 (subarray [4, -1, 2, 1] has sum 6)

    // 1. Triple loop: brute-force
    public static int largestSumTriple(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    // 2. Double loop: slightly optimized
    public static int largestSumNormal(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    // 3. Optimal way: Kadane's Algorithm
    public static int largestSumOptimal(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, -1, 2, 1, -5, 4};

        System.out.println("Array: {4, -1, 2, 1, -5, 4}");

        int sumTriple = largestSumTriple(arr);
        System.out.println("Triple loop largest subarray sum: " + sumTriple);

        int sumNormal = largestSumNormal(arr);
        System.out.println("Double loop largest subarray sum: " + sumNormal);

        int sumOptimal = largestSumOptimal(arr);
        System.out.println("Optimal way (Kadane) largest subarray sum: " + sumOptimal);
    }
}

