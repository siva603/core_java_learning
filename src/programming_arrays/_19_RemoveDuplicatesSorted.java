package programming_arrays;

import java.util.Arrays;

public class _19_RemoveDuplicatesSorted {

    // Question: Given a **sorted integer array**, remove duplicates in-place
    // and move all unique elements to the front.
    //
    // Example:
    // Input: arr = {1, 1, 2, 2, 3, 4, 4, 5}
    // Output: {1, 2, 3, 4, 5, _, _, _}  (first 5 elements are unique)

    public static void removeDuplicates(int[] arr) {
        if (arr.length == 0) return;

        int j = 0; // index for last unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                arr[++j] = arr[i]; // move unique element to next position
            }
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
        System.out.println("Number of unique elements: " + (j + 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        removeDuplicates(arr);
    }
}

