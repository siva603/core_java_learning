package programming_arrays;

import java.util.Arrays;

public class _18_SegregateOddEven {

    // Question: Given an integer array, segregate even and odd elements.
    // Move all even numbers to the left and odd numbers to the right.
    //
    // Example:
    // Input: arr = {12, 17, 70, 15, 22, 65, 21, 90}
    // Output: {12, 70, 22, 90, 17, 15, 65, 21}
    // (Even numbers at start, odd numbers at end. Relative order within groups not important)

    public static void segregateEvenOdd(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // First put all even numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then put all odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Segregated Array: " + Arrays.toString(result));
    }
    
    
    
    // Question: Given an integer array, segregate positive and negative numbers.
    // Move all negative numbers to the left and positive numbers to the right.
    //
    // Example:
    // Input: arr = {12, -7, -5, 3, -1, 8, -4}
    // Output: {-7, -5, -1, -4, 12, 3, 8}
    // (Negative numbers at start, positive numbers at end. Relative order within groups not important)

    public static void segregatePositiveNegative(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // First put all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        // Then put all positive numbers (including 0 if needed)
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Segregated Array: " + Arrays.toString(result));
    }
    

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        segregateEvenOdd(arr);
    }
}

