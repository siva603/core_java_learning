package programming_arrays;

import java.util.HashMap;

public class _16_char_frequency {

	// Question: Given a character array of size n containing only lowercase letters,
    // find the frequency of each character using an array of size 26.
    //
    // Example:
    // Input: arr = {'a', 'b', 'c', 'a', 'b', 'a'}
    // Output:
    // a : 3
    // b : 2
    // c : 1

    public static void findCharFrequency(char[] arr) {
        int[] freq = new int[26]; // for 'a' to 'z'

        // Count frequency of each character
        for (char ch : arr) {
            freq[ch - 'a']++; // Map 'a'-'z' to index 0-25
        }

        // Print characters with frequency > 0
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }
	
    
    
    public static void findCharFrequencyUsingCollection(char[] arr) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : arr) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print frequency of each character
        for (char key : freqMap.keySet()) {
            System.out.println(key + " : " + freqMap.get(key));
        }
    }
    
    
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a'};
        findCharFrequency(arr);
        
        
    }
}
