package programming_arrays;

import java.util.Arrays;

public class _21_MaxElementsBothSides {

    // Question: Given an integer array, for each index, find the maximum element
    // to its left and maximum element to its right.
    //
    // Example:
    // Input: arr = {2, 5, 1, 4, 3}
    // Output:
    // Left Max Array:  [2, 5, 5, 5, 4]
    // Right Max Array: [5, 5, 4, 4, 3]

    public static void findMaxBothSides(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Compute left max for each index
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Compute right max for each index
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        System.out.println("Left Max Array:  " + Arrays.toString(leftMax));
        System.out.println("Right Max Array: " + Arrays.toString(rightMax));
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3};
        findMaxBothSides(arr);
    }
}
