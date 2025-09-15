package programming_strings;

public class _11_Reverse {


    //  Reverse each word
    // Description: Traverse the string, detect words by spaces, reverse characters of each word manually.
    // Example: "Hello World" → "olleH dlroW"
	
    public static void reverseEachWordBuiltIn(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += new StringBuilder(word).reverse().toString() + " ";
        }

        System.out.println("Reverse Each Word (Built-in): " + result.trim());
    }
    
    
    // Helper method to check vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    
    // Helper method to check special character
    public static boolean isSpecialChar(char ch) {
        return !Character.isLetterOrDigit(ch) && ch != ' ';
    }


    public static boolean isSpecialChar2(char ch) {

            if (ch >= 'a' && ch <= 'z') {
                return false;
            } else if (ch >= '0' && ch <= '9') {
                return false;
            } else if (ch == ' ') {
                return false;
            }
            return true;
    }





    // Reverse vowels without array
    public static void reverseVowels(String str) {
        String vowels = "";

        // Collect all vowels in a string
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) vowels += str.charAt(i);
        }

        String result = "";
        int j = vowels.length()-1;
        
        // Place vowels back in reverse order
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                result += vowels.charAt(j--); // take last vowel
            } else {
                result += ch;
            }
        }

        System.out.println("Reverse Vowels (No Array): " + result);
    }







    // Reverse special characters without array
    public static void reverseSpecialCharacters(String str) {
        String specials = "";

        // Collect all special characters in a string
        for (int i = 0; i < str.length(); i++) {
            if (isSpecialChar(str.charAt(i))) specials += str.charAt(i);
        }

        String result = "";
        int j = specials.length()-1;
        // Place special characters back in reverse order
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isSpecialChar(ch)) {
                result += specials.charAt(j--);
            } else {
                result += ch;
            }
        }

        System.out.println("Reverse Special Characters (No Array): " + result);
    }







    // Reverse each word
    public static void reverseEachWord(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;
            } else {
                result += word + " ";
                word = "";
            }
        }
        result += word;
        System.out.println("Reverse Each Word: " + result);
    }







    // Main method
    public static void main(String[] args) {
        String str = "Hello World! Java @Programming#";

        reverseEachWord(str);
        reverseVowels(str);
        reverseSpecialCharacters(str);
    }
}
