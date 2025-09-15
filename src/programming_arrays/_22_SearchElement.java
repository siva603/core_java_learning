package programming_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _22_SearchElement {

    // Question: Linear Search
    // Return true if the target element is found in the array, else false.
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Question: Binary Search
    // Array must be sorted. Return true if target element is found, else false.
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {5, 2, 9, 1, 7};
        System.out.println("Array for Linear Search: " + Arrays.toString(arr1));
        System.out.print("Enter element to search (Linear Search): ");
        int target1 = sc.nextInt();
        if (linearSearch(arr1, target1)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        
        
        
        int[] arr2 = {1, 3, 5, 7, 9}; // must be sorted
        System.out.println("\nArray for Binary Search: " + Arrays.toString(arr2));
        System.out.print("Enter element to search (Binary Search): ");
        int target2 = sc.nextInt();
        if (binarySearch(arr2, target2)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
