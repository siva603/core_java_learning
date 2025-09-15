package programming_strings;

public class _05_StringCharacterCount {

    // Question 1: Count uppercase and lowercase characters in a string.
    // Description: Traverse each character, check ASCII range:
    // 'A'-'Z' → uppercase, 'a'-'z' → lowercase.
    // Example: "HeLLo123" → Uppercase: 3, Lowercase: 2

    public static void countUpperLower(String str) {
        int upper = 0, lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
    }







    // Question 2: Count vowels, consonants, digits, and special characters.
    // Description: Traverse each character:
    // - If letter → check vowel or consonant.
    // - If digit → count as number.
    // - Else → special character.
    // Example: "Hello123@!" → Vowels: 2, Consonants: 3, Numbers: 3, Specials: 2

    public static void countVowelsConsonantsEtc(String str) {
        int vowels = 0, consonants = 0, digits = 0, specials = 0;

        str = str.toLowerCase(); // easy check

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch != ' ') {
                specials++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + digits);
        System.out.println("Special Characters: " + specials);
    }







    // Main Method
    public static void main(String[] args) {
        String str1 = "HeLLo123";
        countUpperLower(str1);

        System.out.println();

        String str2 = "Hello123@!";
        countVowelsConsonantsEtc(str2);
    }
}
