package programming_strings;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class _10_CharacterFrequency {

    // 1. Count frequency of letters a-z using 26-length array (core logic)
    public static void charFrequencyLettersOnly(String str) {
        str = str.toLowerCase();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        System.out.println("Letter Frequencies (Core Logic):");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " = " + freq[i]);
            }
        }
    }

    // 2. Count frequency of letters a-z using built-in method (HashMap)
    public static void charFrequencyLettersBuiltIn(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("\nLetter Frequencies (Built-in HashMap):");
        for (char ch : map.keySet()) {
            System.out.println(ch + " = " + map.get(ch));
        }
    }







    // 3. Print duplicate characters using 26-array
    public static void printDuplicateCharacters(String str) {
        str = str.toLowerCase();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        System.out.print("\nDuplicate characters (Core Logic): ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                System.out.print((char)(i + 'a') + " ");
            }
        }
        System.out.println();
    }







    // 4. Remove duplicate characters using 26-array
    public static void removeDuplicateCharacters(String str) {
        str = str.toLowerCase();
        boolean[] seen = new boolean[26];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!seen[ch - 'a']) {
                    result += ch;
                    seen[ch - 'a'] = true;
                }
            } else {
                result += ch; // keep non-letter characters
            }
        }

        System.out.println("\nString after removing duplicates (Core Logic): " + result);
    }

    // 4b. Remove duplicate characters using built-in LinkedHashSet
    public static void removeDuplicateCharactersBuiltIn(String str) {
        str = str.toLowerCase();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') set.add(ch);
        }

        String result = "";
        for (char ch : set) {
            result += ch;
        }

        System.out.println("String after removing duplicates (Built-in): " + result);
    }



    // Main method
    public static void main(String[] args) {
        String str = "Hello World! Java Programming";

        charFrequencyLettersOnly(str);
        charFrequencyLettersBuiltIn(str);

        printDuplicateCharacters(str);

        removeDuplicateCharacters(str);
        removeDuplicateCharactersBuiltIn(str);
    }
}
