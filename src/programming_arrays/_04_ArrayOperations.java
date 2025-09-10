package programming_arrays;

import java.util.Arrays;

public class _04_ArrayOperations {

//	Write a Java program to find the minimum element in a static array using only a normal for loop and Integer.MAX_VALUE.
//
//	Example Input: {15, 7, 25, 3, 10}
//
//	Example Output: Minimum value = 3
			
    // 1. Find Minimum Value
    public static void findMin() {
        int[] numbers = {15, 7, 25, 3, 10};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Array (for Min): " + Arrays.toString(numbers));
        System.out.println("Minimum value = " + min);
    }
    
    
    
    // Question: Write a program to find the 2nd minimum value in an array.
    public static void secondMin() {
        int[] arr = {25, 5, 15, 35, 45};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second Minimum Value: " + secondMin);
    }
    
    
    
    

//    Maximum Value
//
//    Write a Java program to find the maximum element in a static array using only a normal for loop and Integer.MIN_VALUE.
//
//    Example Input: {8, 12, 4, 20, 16}
//
//    Example Output: Maximum value = 20
//    		
//    		
    // 2. Find Maximum Value
    public static void findMax() {
        int[] numbers = {8, 12, 4, 20, 16};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Array (for Max): " + Arrays.toString(numbers));
        System.out.println("Maximum value = " + max);
    }
    
    
    // Question: Write a program to find the 2nd maximum value in an array.
    public static void secondMax() {
        int[] arr = {10, 40, 20, 60, 30};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second Maximum Value: " + secondMax);
    }
    
    
//    Write a Java program to search for an element in a static array using only a normal for loop.
//
//    If the element is found, print that it is present, otherwise print that it is not present.
//
//    Example Input: Array {5, 9, 13, 21, 30}, Search Key = 21
//
//    Example Output: Element 21 is present in the array.
//    

    // 3. Search for an Element
    public static void searchElement(int element) {
        int[] numbers = {5, 9, 13, 21, 30};
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                found = true;
                break;
            }
        }

        System.out.println("Array (for Search): " + Arrays.toString(numbers));
        if (found) {
            System.out.println("Element " + element + " is present in the array.");
        } else {
            System.out.println("Element " + element + " is NOT present in the array.");
        }
    }
    
    
//    Write a Java program to find the average of elements in a static array using only a normal for loop.
//
//    Example Input: {10, 20, 30, 40, 50}
//
//    Example Output: Average of elements = 30.0

    // 4. Find Average of Elements
    public static void findAverage() {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / numbers.length;

        System.out.println("Array (for Average): " + Arrays.toString(numbers));
        System.out.println("Average of elements = " + avg);
    }

    
    

    // Q: Write a Java program to find the average of even numbers in a static array using only a normal for loop.
    public static void avgEvenNumbers() {
        int[] numbers = {10, 15, 20, 25, 30};
        int sum = 0, count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;

        System.out.println("Array (for Even Avg): " + Arrays.toString(numbers));
        System.out.println("Average of even numbers = " + avg);
    }
    
    
    
    // Q: Write a Java program to find the average of odd numbers in a static array using only a normal for loop.
    public static void avgOddNumbers() {
        int[] numbers = {11, 22, 33, 44, 55};
        int sum = 0, count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;

        System.out.println("Array (for Odd Avg): " + Arrays.toString(numbers));
        System.out.println("Average of odd numbers = " + avg);
    }
    
    
    // Question: Write a program to find the average of elements at even indices in an array.
    public static void avgOfEvenIndices() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // even index
                sum += arr[i];
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average of even indices: " + avg);
    }



    //Question: Write a program to find the average of elements at odd indices in an array.
    public static void avgOfOddIndices() {
        int[] arr = {5, 15, 25, 35, 45, 55};
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { // odd index
                sum += arr[i];
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average of odd indices: " + avg);
    }



    
    
    // Q: Write a Java program to find the average of prime numbers in a static array using only a normal for loop.
    public static void avgPrimeNumbers() {
        int[] numbers = {2, 4, 5, 9, 11, 15, 17};
        int sum = 0, count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                sum += numbers[i];
                count++;
            }
        }

        double avg = (count > 0) ? (double) sum / count : 0;

        System.out.println("Array (for Prime Avg): " + Arrays.toString(numbers));
        System.out.println("Average of prime numbers = " + avg);
    }
    
    
    
    // Helper method to check prime number
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    
    
    
    
    // Main method
    public static void main(String[] args) {
        findMin();
        System.out.println();

        findMax();
        System.out.println();

        searchElement(21);
        searchElement(100); // test with not found
        System.out.println();

        findAverage();
        
        
        avgEvenNumbers();
        System.out.println();

        avgOddNumbers();
        System.out.println();
        
        avgOfEvenIndices();

        avgOfOddIndices();
        
        avgPrimeNumbers();

    }
}
