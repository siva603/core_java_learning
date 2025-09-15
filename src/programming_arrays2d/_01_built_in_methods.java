package programming_arrays2d;

import java.util.Arrays;

public class _01_built_in_methods {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 1. Print 2D array
        System.out.println("2D Array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // 2. Deep toString (prints whole 2D array in one line)
        System.out.println("Deep ToString: " + Arrays.deepToString(arr));

        // 3. Fill a 2D array with a value
        for (int[] row : arr) {
            Arrays.fill(row, 0);
        }
        System.out.println("After filling with 0: " + Arrays.deepToString(arr));

        // 4. Copy a 2D array (shallow copy)
        int[][] shallowCopy = Arrays.copyOf(arr, arr.length);

        // 5. Copy a 2D array (deep copy)
        int[][] deepCopy = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            deepCopy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        System.out.println("Deep Copy: " + Arrays.deepToString(deepCopy));

        // 6. Compare two 2D arrays (deep equals)
        System.out.println("Arrays equal? " + Arrays.deepEquals(arr, deepCopy));
    }
}
