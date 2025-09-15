package programming_arrays;

import java.util.HashMap;

public class _27_LongestSubarraySumK {

    // Question: Given an integer array and an integer k, return the length
    // of the longest subarray whose sum equals k.
    //
    // Example:
    // Input: arr = {4, 1, 1, 1, 2, 3}, k = 5
    // Output: 4 (subarray [1,1,1,2] has length 4)

    // 1. Triple loop: brute-force
    public static int longestSubarrayTriple(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }

        return maxLen;
    }

    // 2. Double loop: normal way
    public static int longestSubarrayNormal(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }

        return maxLen;
    }

    // 3. Optimal way: using HashMap (prefix sum)
    public static int longestSubarrayOptimal(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        map.put(0, -1); // base case for sum from start

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3};
        int k = 5;

        System.out.println("Array: {4, 1, 1, 1, 2, 3}, k = " + k);

        int lengthTriple = longestSubarrayTriple(arr, k);
        System.out.println("Triple loop longest subarray length with sum k: " + lengthTriple);

        int lengthNormal = longestSubarrayNormal(arr, k);
        System.out.println("Double loop longest subarray length with sum k: " + lengthNormal);

        int lengthOptimal = longestSubarrayOptimal(arr, k);
        System.out.println("Optimal way longest subarray length with sum k: " + lengthOptimal);
    }
}

