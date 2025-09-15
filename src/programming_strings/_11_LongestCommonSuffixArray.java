package programming_strings;

public class _11_LongestCommonSuffixArray {

    // Method to find longest common suffix of two strings
    public static String commonSuffix(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        String suffix = "";

        while (i >= 0 && j >= 0) {
        	if(s1.charAt(i) == s2.charAt(j))
        		suffix = s1.charAt(i) + suffix;
        	else 
        		break;
            i--;
            j--;
        }

        return suffix;
    }







    // Method to find longest common suffix in an array of strings
    public static String longestCommonSuffix(String[] arr) {
        if (arr.length == 0) return "";

        String suffix = arr[0]; // start with first string

        for (int i = 1; i < arr.length; i++) {
            suffix = commonSuffix(suffix, arr[i]);
            if (suffix.isEmpty()) break; // no common suffix
        }

        return suffix;
    }







    // Main method to test
    public static void main(String[] args) {
        String[] words = {"flight", "fight", "sight", "might"};

        String result = longestCommonSuffix(words);

        if (!result.isEmpty()) {
            System.out.println("Longest common suffix: " + result);
        } else {
            System.out.println("No common suffix found.");
        }
    }
}

