package programming_arrays;

public class _14_noble_element {

	// Question: Find Noble Elements in an array.
    // Noble Element Definition: An element is called Noble if its value == frequency of that element in the array.
    //
    // Example:
    // Input: {2, 3, 2, 1, 3, 3, 4, 4, 4, 4}
    // Frequency of 2 -> 2
    // Frequency of 3 -> 3
    // Frequency of 4 -> 4
    // Output: 2, 3, 4 are Noble Elements

    public static void findNobleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (arr[i] == count) {
                System.out.println(arr[i] + " is a Noble Element");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 1, 3, 3, 4, 4, 4, 4};
        findNobleElements(arr);
    }
}
