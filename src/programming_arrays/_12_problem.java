package programming_arrays;

import java.util.Arrays;

public class _12_problem {
	
	/**
     * Q: You are given a large integer represented as an integer array digits,
     * where each digits[i] is the i-th digit of the integer.
     * Increment the large integer by one and return the resulting array of digits.
     *
     * Example 1:
     * Input: digits = [1, 2, 3]
     * Output: [1, 2, 4]
     *
     * Example 2:
     * Input: digits = [9, 9, 9]
     * Output: [1, 0, 0, 0]
     */
	
    public static void plusOne() {
        int[] digits = {9, 9, 9};  // Example input

        // Traverse array from last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit < 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println("Result: " + Arrays.toString(digits));
                return;
            }
            // If digit is 9, it becomes 0 (carry to next)
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        System.out.println("Result: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        plusOne();
    }
}
