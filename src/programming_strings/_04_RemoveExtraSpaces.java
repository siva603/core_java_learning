package programming_strings;

public class _04_RemoveExtraSpaces {

    // Question: Remove extra spaces from a sentence.
    // Description: Keep only one space between words. 
    // Ignore consecutive spaces by checking condition: !(c == ' ' && next char is also ' ').
    // Example: "  I   love   Java  " → " I love Java "

    public static void main(String[] args) {
        String s = "  I   love   Java  ";
        String result = "";

        s.trim();
        
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);

            // add character if not double space
            if (!(c == ' ' && s.charAt(i + 1) == ' ')) {
                result += c;
            }
        }

        // add last character also
        result += s.charAt(s.length() - 1);

        System.out.println("Original : [" + s + "]");
        System.out.println("Cleaned  : [" + result + "]");
    }
}

