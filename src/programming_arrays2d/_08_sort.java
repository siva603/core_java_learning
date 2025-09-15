package programming_arrays2d;

import java.util.Arrays;

public class _08_sort {

    // ------------------------------------------------------------
    /*
     Question 1:
     Write a program to sort each row of a 2D array individually.

     Example:
     Input:
     [
       [9, 8, 7],
       [6, 5, 4],
       [3, 2, 1]
     ]

     Output (Row by Row Sorted):
     [
       [7, 8, 9],
       [4, 5, 6],
       [1, 2, 3]
     ]
    */
    public static void sortRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            sort(arr[i]);
        }
        System.out.println("Row by Row Sorted: " + Arrays.deepToString(arr));
    }
    
    public static void sort(int arr[]) {
    	int i=0;
    	int j=arr.length-1;
    	while( i < j) {
    		int temp = arr[i];
    		arr[i] = arr[j];
    		arr[j] = arr[i];
    	}
    }

    public static void sortRows2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Row by Row Sorted: " + Arrays.deepToString(arr));
    }
    
    // ------------------------------------------------------------
    /*
     Question 2:
     Write a program to sort each column of a 2D array individually.

     Example:
     Input:
     [
       [9, 8, 7],
       [6, 5, 4],
       [3, 2, 1]
     ]

     Output (Column by Column Sorted):
     [
       [3, 2, 1],
       [6, 5, 4],
       [9, 8, 7]
     ]
    */
    public static void sortColumns(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int[] colArr = new int[rows];

            // extract column
            for (int i = 0; i < rows; i++) {
                colArr[i] = arr[i][j];
            }

            // sort column
            Arrays.sort(colArr);

            // put back into matrix
            for (int i = 0; i < rows; i++) {
                arr[i][j] = colArr[i];
            }
        }

        System.out.println("Column by Column Sorted: " + Arrays.deepToString(arr));
    }

    // ------------------------------------------------------------
    /*
     Question 3:
     Write a program to sort the entire 2D array.

     Example:
     Input:
     [
       [9, 8, 7],
       [6, 5, 4],
       [3, 2, 1]
     ]

     Output (Entire Array Sorted):
     [
       [1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]
     ]
    */
    public static void sortEntire(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[] flat = new int[rows * cols];

        // flatten 2D -> 1D
        int k = 0;
        for (int[] row : arr) {
            for (int num : row) {
                flat[k++] = num;
            }
        }

        // sort 1D
        Arrays.sort(flat);

        // put back 1D -> 2D
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = flat[k++];
            }
        }

        System.out.println("Entire Array Sorted: " + Arrays.deepToString(arr));
    }

    // ------------------------------------------------------------
    
    public static void main(String[] args) {
        int[][] arr1 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        sortRows(arr1);

        int[][] arr2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        sortColumns(arr2);

        int[][] arr3 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        sortEntire(arr3);
    }
}

