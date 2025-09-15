package programming_arrays;

import java.util.Arrays;

public class _08_selection_sorting_algo {

    // Question: Write a program to sort an array using the Selection Sort algorithm.
    public static void selectionSort() {
        int[] arr = {29, 10, 14, 37, 13};
        int n = arr.length;

        // Outer loop for each position
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume current index has the minimum element

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(arr));
    }



    public static void main(String[] args) {
        selectionSort();
    }
}
