package programming_arrays2d;

import java.util.Arrays;

public class _05_Array2DMinMaxSegregated {

    // =================== MAX METHODS ===================

    // Print maximum in entire 2D array
    public static void maxInArray(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        System.out.println("Max in entire array: " + max);
    }

    // Print maximum in each row
    public static void maxInEachRow(int[][] arr) {
        System.out.print("Max in each row: ");
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    // Print maximum in each column
    public static void maxInEachColumn(int[][] arr) {
        System.out.print("Max in each column: ");
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            int max = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    // =================== MIN METHODS ===================

    // Print minimum in entire 2D array
    public static void minInArray(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        System.out.println("Min in entire array: " + min);
    }

    // Print minimum in each row
    public static void minInEachRow(int[][] arr) {
        System.out.print("Min in each row: ");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print(min + " ");
        }
        System.out.println();
    }

    // Print minimum in each column
    public static void minInEachColumn(int[][] arr) {
        System.out.print("Min in each column: ");
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            int min = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print(min + " ");
        }
        System.out.println();
    }

    // =================== MAIN METHOD ===================

    public static void main(String[] args) {

        int[][] arr = {
            {2, 8, 5},
            {4, 1, 9},
            {7, 6, 3}
        };

        System.out.println("2D Array: " + Arrays.deepToString(arr));
        System.out.println();

        // MAX METHODS
        maxInArray(arr);
        maxInEachRow(arr);
        maxInEachColumn(arr);
        System.out.println();

        // MIN METHODS
        minInArray(arr);
        minInEachRow(arr);
        minInEachColumn(arr);
    }
}

