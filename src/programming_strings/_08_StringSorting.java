package programming_strings;

import java.util.Arrays;

public class _08_StringSorting {

    // 1. Sort characters in a string using core logic (without built-in sort)
    public static void sortStringCharsCore(String str) {
        char[] arr = str.toCharArray();

        // Simple Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted characters (core logic): " + new String(arr));
    }

    // 1b. Sort characters in a string using built-in method
    public static void sortStringCharsBuiltIn(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted characters (built-in): " + new String(arr));
    }







    // 2. Sort array of strings using core logic (without built-in sort)
    public static void sortStringArrayCore(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted string array (core logic): ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 2b. Sort array of strings using built-in method
    public static void sortStringArrayBuiltIn(String[] arr) {
        Arrays.sort(arr);
        System.out.print("Sorted string array (built-in): ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }







    // Main method to test
    public static void main(String[] args) {
        String str = "java";
        String[] arr = {"banana", "apple", "mango", "cherry"};

        sortStringCharsCore(str);
        sortStringCharsBuiltIn(str);

        System.out.println();

        sortStringArrayCore(arr.clone());  // use clone to avoid affecting next method
        sortStringArrayBuiltIn(arr);
    }
}

