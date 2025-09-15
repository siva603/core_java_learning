package programming_arrays2d;

public class _09_Transpose2DArray {

	   /*
    Question:
    Write a program to find the transpose of a 2D square matrix 
    without using an extra array (in-place transpose).

    Transpose of a matrix:
    - Rows become columns
    - Columns become rows

    Example:
    Input:
    [
      [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]
    ]

    Output (Transpose):
    [
      [1, 4, 7],
      [2, 5, 8],
      [3, 6, 9]
    ]
   */
	
	
    public static void transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // print result
        System.out.println("Original Matrix:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void transposeWithoutTemp(int[][] arr) {
        int n = arr.length;

        // only swap elements above diagonal to avoid double swapping
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // print result
        System.out.println("Transposed Matrix:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    	
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        transpose(arr);
    }
}
