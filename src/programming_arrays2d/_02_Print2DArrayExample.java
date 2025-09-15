package programming_arrays2d;

import java.util.Arrays;

public class _02_Print2DArrayExample {

    public static void main(String[] args) {

        // Initialize a 2D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 1st Way: Using normal two loops
        System.out.println("1st Way: Using normal two loops");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        System.out.println(); // Empty line for readability

        // 2nd Way: Using Arrays.deepToString()
        System.out.println("2nd Way: Using Arrays.deepToString()");
        System.out.println(Arrays.deepToString(arr));

        System.out.println(); // Empty line for readability

        // 3rd Way: Using Arrays.toString() with normal loop
        System.out.println("3rd Way: Using Arrays.toString() with normal loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println(); // Empty line for readability

        // 4th Way: Using Arrays.toString() with enhanced for loop
        System.out.println("4th Way: Using Arrays.toString() with enhanced for loop");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}

