package programming_arrays;

import java.util.Arrays;

public class _01_build_method_and_logics {

	/*
	 * 
	 * build in methods for arrays
	 * ---------------------------
	 * 
	 * Arrays.toString(arr) --> for single dimensional array and it is method overloading
	 * 
	 * Arrays.deepToString(arr) --> for two dimensional array
	 * 
	 * Arrays.sort(arr) --> ascending order
	 * 
	 * 
	 * 
	 */
	
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        // 1. Print array
        System.out.println("Array: " + Arrays.toString(arr));

        
        
        // 2. Sort array
        int[] sortedArr = arr.clone(); // clone to keep original
        Arrays.sort(sortedArr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));

        
        
        // 3. Linear search using Arrays.binarySearch (works only for sorted array)
        int target = 9;
        int index = Arrays.binarySearch(sortedArr, target);
        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index + " (binary search)");
        } else {
            System.out.println("Element " + target + " not found (binary search)");
        }

        
        
        // 4. Fill array
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 10);
        System.out.println("Filled Array: " + Arrays.toString(fillArr));

        
        
        // 5. Copy array
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArr));

        
        
        // 6. Check equality
        System.out.println("Arrays equal? " + Arrays.equals(arr, copyArr));

        
        
        // 7. Find min and max (manual using Arrays.stream)
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min: " + min + ", Max: " + max);


    }
}
