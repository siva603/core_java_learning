package programming_arrays2d;

import java.util.Arrays;

public class _07_DiagonalSum2DArray {

    /*
     Question:
     Write a program to find the sum of primary diagonal elements
     and secondary diagonal elements in a 2D square matrix.

     Primary Diagonal -> Elements where row == column
     Secondary Diagonal -> Elements where row + column == n - 1

     Example:
     Input Matrix:
     [
       [1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]
     ]

     Primary Diagonal: 1 + 5 + 9 = 15
     Secondary Diagonal: 3 + 5 + 7 = 15
    */

    // Method to calculate and print diagonal sums
    public static void diagonalSums(int[][] arr) {
        int n = arr.length;

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];              // row == col
            secondarySum += arr[i][n - 1 - i];    // row + col = n - 1
        }

        System.out.println("Matrix: " + Arrays.deepToString(arr));
        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        diagonalSums(arr);
    }
}

