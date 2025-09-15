package programming_arrays;

public class _24_findMedian {

    /*
    Problem: Median of Two Sorted Arrays

    Question:
    You are given two sorted integer arrays a[] and b[]. 
    Write a method findMedian to find the median of the combined sorted array formed by merging both arrays.
    
    - If total elements are odd, median is the middle element.
    - If total elements are even, median is the average of the two middle elements.
    
    Approach / Steps:
    1. Initialize pointers i, j for arrays a[] and b[], and k for merged array out[].
    2. Merge arrays: Compare a[i] and b[j], put smaller in out[k], move pointers.
    3. Copy remaining elements of a[] or b[] if any.
    4. If merged array length is even, median = average of middle two elements.
       Else, median = middle element.
    
    Examples:

    Example 1:
    Input: a = {1, 3}, b = {2}
    Merged array: [1, 2, 3]
    Median: 2.0

    Example 2:
    Input: a = {1, 2}, b = {3, 4}
    Merged array: [1, 2, 3, 4]
    Median: (2 + 3)/2 = 2.5
    */

    // Method to find median of two sorted arrays
    static double findMedian(int a[], int b[]) 
    {
        int m = a.length; // length of first array
        int n = b.length; // length of second array
        int out[] = new int[m + n]; // merged array
        int i = 0; // pointer for array a
        int j = 0; // pointer for array b
        int k = 0; // pointer for merged array

        // Merge arrays in sorted order
        while (i < m && j < n) 
        {
            if (a[i] < b[j]) 
            {
                out[k] = a[i]; // take element from a
                i++;
            } 
            else 
            {
                out[k] = b[j]; // take element from b
                j++;
            }
            k++;
        }

        // Copy remaining elements of a[], if any
        while (i < m) 
        {
            out[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b[], if any
        while (j < n) 
        {
            out[k] = b[j];
            j++;
            k++;
        }

        // Find median
        if (out.length % 2 == 0) // even number of elements
        {
            int mid = out.length / 2;
            double n1 = out[mid - 1];
            double n2 = out[mid];
            return (n1 + n2) / 2.0;
        } 
        else // odd number of elements
        {
            return out[out.length / 2];
        }
    }

    public static void main(String[] args) 
    {
        // Example 1
        int num1[] = {1, 3};
        int num2[] = {2};
        System.out.println(findMedian(num1, num2)); // Output: 2.0

        // Example 2
        int n1[] = {1, 2};
        int n2[] = {3, 4};
        System.out.println(findMedian(n1, n2));   // Output: 2.5
    }
}

