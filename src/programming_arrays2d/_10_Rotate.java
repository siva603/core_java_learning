package programming_arrays2d;

import java.util.Arrays;

public class _10_Rotate {
	
	
	 /*
    Question:
    Write a program to rotate a square 2D matrix by 90 degrees clockwise
    using the transpose + reverse row method.

    Steps:
    1. Transpose the matrix (swap rows and columns).
    2. Reverse each row.

    Example:
    Input:
    [
      [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]
    ]

    After transpose:
    [
      [1, 4, 7],
      [2, 5, 8],
      [3, 6, 9]
    ]

    After reversing each row (final result):
    [
      [7, 4, 1],
      [8, 5, 2],
      [9, 6, 3]
    ]
   */

	

   // Rotate 90 degrees clockwise
   public static void rotate90Clockwise(int[][] arr) {
       System.out.println("Original Matrix:");
       System.out.println(Arrays.deepToString(arr));
 
       transpose(arr);
       reverseRows(arr);
       
       System.out.println("Rotated Matrix (90° Clockwise):");
       System.out.println(Arrays.deepToString(arr));

   }

   // Reverse rows
   private static void reverseRows(int[][] arr) {
       int n = arr.length;
       for (int i = 0; i < n / 2; i++) {
           int[] temp = arr[i];
           arr[i] = arr[n - 1 - i];
           arr[n - 1 - i] = temp;
       }
   }

   
   // Transpose
   private static void transpose(int[][] arr) {
       int n = arr.length;
       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
           }
       }
   }
   
   
    /*
     Question:
     Rotate a square 2D matrix by 90° Anti-Clockwise
     using reverse rows first and then transpose.

     Example:
     Input:
     [
       [1, 2, 3],
       [4, 5, 6],
       [7, 8, 9]
     ]

     After reversing rows:
     [
       [7, 8, 9],
       [4, 5, 6],
       [1, 2, 3]
     ]

     After transpose (final result):
     [
       [3, 6, 9],
       [2, 5, 8],
       [1, 4, 7]
     ]
    */

 

    // Rotate Anti-Clockwise
    public static void rotate90AntiClockwise(int[][] arr) {
        System.out.println("Original Matrix:");
        System.out.println(Arrays.deepToString(arr));
        
        reverseRows(arr);   // Step 1
        transpose(arr);     // Step 2

        System.out.println("Rotated Matrix (90° Anti-Clockwise):");
        System.out.println(Arrays.deepToString(arr));

    }

    // ------------------------------------------------------
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate90AntiClockwise(arr);
    }
}

