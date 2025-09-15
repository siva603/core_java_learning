package programming_arrays;

public class _29_LargestSubarrayProduct {

    // Question: Given an integer array, return the product of the subarray
    // with the largest product.
    //
    // Example:
    // Input: arr = {2, 3, -2, 4}
    // Output: 6 (subarray [2,3] has product 6)

    // 1. Triple loop: brute-force
    public static int largestProductTriple(int[] arr) {
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int product = 1;
                for (int i = start; i <= end; i++) {
                    product *= arr[i];
                }
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }

    // 2. Double loop: slightly optimized
    public static int largestProductNormal(int[] arr) {
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int product = 1;
            for (int end = start; end < n; end++) {
                product *= arr[end];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    // 3. Optimal way: using max/min product at each position
    public static int largestProductOptimal(int[] arr) {
        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int tempMax = maxProd;
            maxProd = Math.max(arr[i], Math.max(maxProd * arr[i], minProd * arr[i]));
            minProd = Math.min(arr[i], Math.min(tempMax * arr[i], minProd * arr[i]));
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        System.out.println("Array: {2, 3, -2, 4}");

        int productTriple = largestProductTriple(arr);
        System.out.println("Triple loop largest subarray product: " + productTriple);

        int productNormal = largestProductNormal(arr);
        System.out.println("Double loop largest subarray product: " + productNormal);

        int productOptimal = largestProductOptimal(arr);
        System.out.println("Optimal way largest subarray product: " + productOptimal);
    }
}
