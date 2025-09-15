package programming_arrays;
import java.util.Arrays;

public class _23_insertionSort {
	
    /*
    Problem: Selection Sort

    Question:
    You are given an integer array a[]. 
    Write a method selectionSort to sort the array in ascending order using the Selection Sort algorithm.

    Approach / Steps:
    1. Start from the first element and assume it as the minimum.
    2. Compare it with the rest of the array to find the actual minimum element.
    3. Swap the minimum element found with the current element.
    4. Move to the next element and repeat steps 1-3 until the array is sorted.

    Example:

    Input: a = {5, 3, 4, 1, 0, 8, 2}
    Process:
    - Step 1: Find min in [5, 3, 4, 1, 0, 8, 2] → 0, swap with 5 → [0, 3, 4, 1, 5, 8, 2]
    - Step 2: Find min in [3, 4, 1, 5, 8, 2] → 1, swap with 3 → [0, 1, 4, 3, 5, 8, 2]
    - Step 3: Find min in [4, 3, 5, 8, 2] → 2, swap with 4 → [0, 1, 2, 3, 5, 8, 4]
    ... continue until sorted

    Output: [0, 1, 2, 3, 4, 5, 8]
    */
	
	
    static void insertionSort(int a[]) {
    	
        for (int i = 1; i < a.length; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > t) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 0, 8, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
