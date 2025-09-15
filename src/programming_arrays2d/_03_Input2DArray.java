package programming_arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Input2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] arr = new int[rows][cols];

        // Take input for each element
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(); // Empty line for readability

        // Print 2D array using deepToString
        System.out.println("2D Array:");
        System.out.println(Arrays.deepToString(arr));

        sc.close();
    }
}

