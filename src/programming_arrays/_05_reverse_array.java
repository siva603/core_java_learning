package programming_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_reverse_array{

    // 1. Question: Write a program to reverse an array using a temporary array.
    public static void reverseArrayWithTemp() {
        int[] arr = {10, 20, 30, 40, 50};
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array (with temp): " + Arrays.toString(temp));
    }



    // 2. Question: Write a program to reverse an array without using a temporary array (in-place).
    public static void reverseArrayInPlace() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array (in-place): " + Arrays.toString(arr));
    }



    // 3. Question: Write a program to reverse an array using the two-pointer approach.
    public static void reverseArrayTwoPointer() {
        int[] arr = {11, 22, 33, 44, 55};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array (two-pointer): " + Arrays.toString(arr));
    }



    // 4. Question: Write a program to reverse only a subarray (fixed indices).
    public static void reverseSubArray() {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int start = 1, end = 4; // reverse elements from index 1 to 4

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed SubArray (1 to 4): " + Arrays.toString(arr));
    }



    // 5. Question: Write a program to reverse a subarray where start and end indices are taken from the user.
    public static void reverseSubArrayUserInput() {
        int[] arr = {100, 200, 300, 400, 500, 600};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed SubArray (user input): " + Arrays.toString(arr));
    }



    // 6. Question: Write a program to reverse only half of an array.
    public static void reverseHalfArray() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};

        int mid = arr.length / 2; // half length
        int left = 0, right = mid - 1; // reverse only first half

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Half Array: " + Arrays.toString(arr));
    }



    // Main method to call all operations
    public static void main(String[] args) {
        reverseArrayWithTemp();
        System.out.println();

        reverseArrayInPlace();
        System.out.println();

        reverseArrayTwoPointer();
        System.out.println();

        reverseSubArray();
        System.out.println();

        reverseSubArrayUserInput();
        System.out.println();

        reverseHalfArray();
    }
}
