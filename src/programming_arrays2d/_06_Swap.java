package programming_arrays2d;

import java.util.Arrays;

import java.util.Arrays;

public class _06_Swap {

    // Swap all rows using two-pointer approach with i and j
    public static void swapRows(int[][] arr) {
    	
        System.out.println("Before Swapping:");
        System.out.println(Arrays.deepToString(arr));

        int i = 0;                // pointer at first row
        int j = arr.length - 1;   // pointer at last row

        while (i < j) {
            // swap rows i and j
            int[] temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("\nAfter Swapping:");
        System.out.println(Arrays.deepToString(arr));
    }
    
    
    // Swap all columns using two-pointer approach with i and j
    public static void swapColumns(int[][] arr) {
        System.out.println("Before Swapping:");
        System.out.println(Arrays.deepToString(arr));

        int i = 0;                  // pointer at first column
        int j = arr[0].length - 1;  // pointer at last column

        while (i < j) {
            // swap elements in each row
            for (int r = 0; r < arr.length; r++) {
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
            }
            i++;
            j--;
        }

        System.out.println("\nAfter Swapping:");
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1,  2,  3},
            {4,  5,  6},
            {7,  8,  9},
            {10, 11, 12}
        };

        // Method handles printing
        swapRows(arr);
    }
}
