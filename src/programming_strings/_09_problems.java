package programming_strings;

import java.util.Arrays;
import java.util.HashSet;

public class _09_problems {

    // 1. Check if two strings are anagrams
    // Description: Two strings are anagrams if they contain same characters in any order
	
    // Example: "listen" and "silent" → Anagram


    // Built-in method
    public static boolean isAnagramBuiltIn(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }


    // Check if three strings are anagrams of each other
    public static boolean isThreeAnagrams(String s1, String s2, String s3) {
        return isAnagramBuiltIn(s1, s2) && isAnagramBuiltIn(s2, s3);
    }



    // 2. Check if a string is a pangram
    // Description: A pangram contains all letters a-z at least once
    // Example: "The quick brown fox jumps over the lazy dog" → Pangram

  
    public static boolean isPangramBuiltIn(String str) {
        str = str.toLowerCase();
   
        for(char c = 'a' ; c<='z' ; c++) {
        	if(str.indexOf(c)==-1)
        		return false;
        }
        return true;
    }

    

    // Question : Reverse each word using core logic
    
    // Description: Traverse the string, detect words by spaces, reverse characters of each word manually.
    // Example: "Hello World" → "olleH dlroW"


    public static void reverseEachWordBuiltIn(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            result += reversed + " ";
        }

        result = result.trim(); // remove trailing space
        System.out.println("Reversed each word (Built-in): " + result);
    }
    
    

    // Main Method
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Anagram (built-in): " + isAnagramBuiltIn(s1, s2));

        String pangramStr = "The quick brown fox jumps over the lazy dog";
        System.out.println("Pangram (built-in): " + isPangramBuiltIn(pangramStr));
    }
}

