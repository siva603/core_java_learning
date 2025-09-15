package programming_strings;

public class _02_words_count {

    // Question 1: Write a program to count the number of characters in a string.

    // Example:
    // Input: "Hello World"
    // Output: Total characters: 11


    public static void countCharacters() {
        String str = "Hello World";

        // -------- Method 1: Using length() --------
        // Description: Directly use the built-in length() method.
        int count1 = str.length();
        System.out.println("Characters (Method 1): " + count1);


        // -------- Method 2: Using for loop --------
        // Description: Traverse each character and increase counter.
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            count2++;
        }
        System.out.println("Characters (Method 2): " + count2);
    }




    // Question 2: Write a program to count the number of words in a string.

    // Example:
    // Input: "  I love   Java programming  "
    // Output: Total words: 4


    public static void countWords() {
    	
    	
        String str = "  I love   Java programming  ";


        // Using core logic with loop --------
        // Description: Traverse each character, detect start of words manually.
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if( (i==0 && str.charAt(i)!=' ') || (str.charAt(i)!=' ' && str.charAt(i-1) == ' ')) {
            	count++;
            }
        }

        System.out.println("Words (Method 1): " + count);
        
        
        
        //Using trim() + split("_+") --------
        // Description: Trim spaces and split by one or more spaces, then count array length.
        String[] words = str.trim().split(" +");
        System.out.println("Words (Method 2): " + words.length);

        
        
    }




    public static void main(String[] args) {
        countCharacters();
        System.out.println();
        countWords();
    }
}
