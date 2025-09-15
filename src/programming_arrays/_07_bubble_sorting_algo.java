package programming_arrays;
import java.util.Arrays;

public class _07_bubble_sorting_algo {

    // Question: Write a program to sort an array using the Bubble Sort algorithm.
    public static void bubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));
    }



    public static void main(String[] args) {
        bubbleSort();
    }
}

