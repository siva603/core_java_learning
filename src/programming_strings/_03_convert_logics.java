package programming_strings;

public class _03_convert_logics {
	
		// Question 1: Convert a string to UPPERCASE
	    // Description: Show both ways - core logic (manual conversion) and using built-in method.
	    // Example: "hello" → "HELLO"

	    public static void toUpperCaseCustom(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                result += (char)(ch - 32);
	            } else {
	                result += ch;
	            }
	        }
	        System.out.println("Uppercase (Core Logic): " + result);
	    }

	    public static void toUpperCaseBuiltIn(String str) {
	        System.out.println("Uppercase (Built-in): " + str.toUpperCase());
	    }







	    // Question 2: Convert a string to lowercase
	    // Description: Show both ways - core logic (manual conversion) and using built-in method.
	    // Example: "HELLO" → "hello"

	    public static void toLowerCaseCustom(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                result += (char)(ch + 32);
	            } else {
	                result += ch;
	            }
	        }
	        System.out.println("Lowercase (Core Logic): " + result);
	    }

	    public static void toLowerCaseBuiltIn(String str) {
	        System.out.println("Lowercase (Built-in): " + str.toLowerCase());
	    }







	    // Question 3: Convert only the initial character of each word to uppercase
	    // Description: Use efficient logic (detect word start by spaces) + also built-in method.
	    // Example: "  java   is   fun  " → "  Java   Is   Fun  "

	    public static void capitalizeWordsCustom(String str) {
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if ((i == 0 && ch != ' ') || (ch != ' ' && str.charAt(i - 1) == ' ')) {
	                // make initial character uppercase if it's lowercase
	                if (ch >= 'a' && ch <= 'z') {
	                    result += (char)(ch - 32);
	                } else {
	                    result += ch;
	                }
	            } else {
	                result += ch;
	            }
	        }

	        System.out.println("Capitalized Words (Core Logic): " + result);
	    }

	    public static void capitalizeWordsBuiltIn(String str) {
	        String[] words = str.trim().split("\\s+");
	        String result = "";

	        for (String word : words) {
	            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
	        }

	        System.out.println("Capitalized Words (Built-in): " + result.trim());
	    }







	    // Main Method to run all
	    public static void main(String[] args) {
	        String str1 = "hello world";
	        toUpperCaseCustom(str1);
	        toUpperCaseBuiltIn(str1);

	        System.out.println();

	        String str2 = "HELLO WORLD";
	        toLowerCaseCustom(str2);
	        toLowerCaseBuiltIn(str2);

	        System.out.println();

	        String str3 = "  java   is   fun  ";
	        capitalizeWordsCustom(str3);
	        capitalizeWordsBuiltIn(str3);
	    }
	}

