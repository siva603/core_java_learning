package programming_strings;

public class _06_PalindromeCheck {

    // Question: Check if a given string is a palindrome.
	
    // Example: "madam" → Palindrome, "hello" → Not Palindrome

    // Method 1: Using for loop to reverse string
    public static String isPalindromeReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev) ? "Palindrome" : "Not Palindrome";
    }



    // Method 2: Using 2-pointer approach
    public static String isPalindromeTwoPointer(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return "Not Palindrome";
            }
            left++;
            right--;
        }

        return "Palindrome";
    }



    // Method 3: Using StringBuilder reverse()
    public static String isPalindromeStringBuilder(String str) {
        String revStr = new StringBuilder(str).reverse().toString();
        return str.equals(revStr) ? "Palindrome" : "Not Palindrome";
    }
    
    

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println("Input: " + str1);
        System.out.println("Method 1 (Reverse & equals): " + isPalindromeReverse(str1));
        System.out.println("Method 2 (2-Pointer): " + isPalindromeTwoPointer(str1));
        System.out.println("Method 3 (StringBuilder): " + isPalindromeStringBuilder(str1));

        System.out.println("\nInput: " + str2);
        System.out.println("Method 1 (Reverse & equals): " + isPalindromeReverse(str2));
        System.out.println("Method 2 (2-Pointer): " + isPalindromeTwoPointer(str2));
        System.out.println("Method 3 (StringBuilder): " + isPalindromeStringBuilder(str2));
    }

}
