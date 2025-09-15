package programming_arrays;

import java.util.HashMap;

public class _26_SubarraySumKBothWays {

    // Question: Given an integer array and an integer k, return the total
    // number of subarrays whose sum equals k.
    //
    // Example:
    // Input: arr = {1, 2, 3}, k = 3
    // Output: 2 (subarrays [1,2] and [3])
	
    // 1. Normal way: using thriple loop
    public static int countSubarraysWithSumK(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        // First loop: start index of subarray
        for (int start = 0; start < n; start++) {
            // Second loop: end index of subarray
            for (int end = start; end < n; end++) {
                int sum = 0;
                // Third loop: calculate sum of subarray from start to end
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // 2. best way: using double loop
    public static int countSubarraysNormal(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // 3. Optimal way: using HashMap (prefix sum)
    public static int countSubarraysOptimal(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        System.out.println("Array: {1, 2, 3}, k = " + k);

        int totalNormal = countSubarraysNormal(arr, k);
        System.out.println("Normal way total subarrays with sum k: " + totalNormal);

        int totalOptimal = countSubarraysOptimal(arr, k);
        System.out.println("Optimal way total subarrays with sum k: " + totalOptimal);
    }
}

