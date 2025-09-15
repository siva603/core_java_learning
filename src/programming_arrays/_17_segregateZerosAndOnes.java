package programming_arrays;

import java.util.Arrays;

public class _17_segregateZerosAndOnes {


    // Question: Given a binary array (containing only 0's and 1's),
    // segregate 0's to the left and 1's to the right using simple counting method.
    //
    // Example:
    // Input: arr = {0, 1, 0, 1, 1, 0, 0, 1}
    // Output: {0, 0, 0, 0, 1, 1, 1, 1}

    public static void segregateZerosOnes(int[] arr) {
        int n = arr.length;
        int countOnes = 0;

        // Count number of 1's in array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) countOnes++;
        }

        for(int i=0;i<n;i++) {
        	if(countOnes > 0) {
        		arr[i] = 1;
        		countOnes--;
        	}
        	else {
        		arr[i] = 0;
        	}
        }
        
        System.out.println("Segregated Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        segregateZerosOnes(arr);
    }
}
