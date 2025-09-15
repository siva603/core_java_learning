package programming_strings;

import java.util.HashSet;

public class _07_substrings_strings{

    // 1. Print all possible substrings using core logic (without using substring)
    public static void printAllSubstringsCore(String str) {
        System.out.println("1. All substrings (core logic):");
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                System.out.println(temp);
            }
        }
    }

    // 2. Print all possible substrings using substring method
    public static void printAllSubstrings(String str) {
        System.out.println("\n2. All substrings (using substring):");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    // 3. Print all substrings without repeating characters
    public static void printSubstringsNoRepeat(String str) {
        System.out.println("\n3. Substrings without repeating characters:");
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (set.contains(ch)) break;
                set.add(ch);
                temp += ch;
                System.out.println(temp);
            }
        }
    }

    // 4. Print the longest substring with length (may contain repeating characters)
    public static void printLongestSubstring(String str) {
        int maxLen = 0;
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                if (temp.length() > maxLen) {
                    maxLen = temp.length();
                    longest = temp;
                }
            }
        }
        System.out.println("\n4. Longest substring: " + longest + " (Length: " + maxLen + ")");
    }

    // 5. Longest substring without repeating characters
    public static void printLongestSubstringNoRepeat(String str) {
        int maxLen = 0;
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (set.contains(ch)) break;
                set.add(ch);
                temp += ch;
                if (temp.length() > maxLen) {
                    maxLen = temp.length();
                    longest = temp;
                }
            }
        }
        System.out.println("\n5. Longest substring without repeating characters: " + longest + " (Length: " + maxLen + ")");
    }

    // 6. Print all palindromic substrings
    public static void printPalindromeSubstrings(String str) {
        System.out.println("\n6. Palindromic substrings:");
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }

    // 7. Print the longest palindromic substring
    public static void printLongestPalindromeSubstring(String str) {
        int maxLen = 0;
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                if (isPalindrome(temp) && temp.length() > maxLen) {
                    maxLen = temp.length();
                    longest = temp;
                }
            }
        }
        System.out.println("\n7. Longest palindrome substring: " + longest + " (Length: " + maxLen + ")");
    }

    // Helper method to check palindrome
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Main Method to test
    public static void main(String[] args) {
        String str = "abac";

        printAllSubstringsCore(str);
        printAllSubstrings(str);
        printSubstringsNoRepeat(str);
        printLongestSubstring(str);
        printLongestSubstringNoRepeat(str);
        printPalindromeSubstrings(str);
        printLongestPalindromeSubstring(str);
    }
}
