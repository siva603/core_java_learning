package programming_arrays;

import java.util.Arrays;

public class _10_merge_array_without_sorting {


    /**
     * Q: Write a program to merge two arrays into a single array 
     * without changing their order.
     * 
     * Example:
     * Input: arr1 = {10, 5, 30}, arr2 = {25, 15, 40}
     * Output: mergedArr = {10, 5, 30, 25, 15, 40}
     */
    public static void mergeTwoArrays() {
        int[] arr1 = {10, 5, 30};
        int[] arr2 = {25, 15, 40};

        // Create new array with combined size
        int[] mergedArr = new int[arr1.length + arr2.length];

        // Copy arr1 elements into mergedArr
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }

        // Copy arr2 elements into mergedArr (after arr1)
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }

        // Print merged array (unordered)
        System.out.println("Merged Array (Unordered): " + Arrays.toString(mergedArr));
    }
    
    
    
    /**
     * Merge two sorted arrays into a single sorted array.
     * Example:
     * arr1 = {2, 6, 10}, arr2 = {1, 5, 7, 12}
     * Output = {1, 2, 5, 6, 7, 10, 12}
     */
    public static void mergeSortedArrays() {
    	
        int[] arr1 = {2, 6, 10};
        int[] arr2 = {1, 5, 7, 12};
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }

    
    public static void main(String[] args) {
        mergeTwoArrays();
    }
}
