package programming_strings;

public class _01_builtin_methods_and_logics {

	/*
	 * 
	 * build in methods for String
	 * ---------------------------
	 * 
	 * 
	 * 
	 * 
	 * 
	 * logics for String
	 * -----------------
	 * 1. characters frequnecy(count)
	 * 2. words frequency
	 * 
	 */
	
	
	// Program: Demonstrating Java String Built-in Methods
	// Each method is shown with description, syntax, and example.

	    public static void main(String[] args) {



	        // 1. length()
	        // Description: Returns the number of characters in a string.
	        // Syntax: string.length();
	        String s1 = "Hello";
	        System.out.println("length(): " + s1.length()); // 5




	        // 2. charAt(int index)
	        // Description: Returns character at given index.
	        // Syntax: string.charAt(index);
	        String s2 = "Java";
	        System.out.println("charAt(2): " + s2.charAt(2)); // v




	        // 3. substring()
	        // Description: Extracts a portion of the string.
	        // Syntax: string.substring(beginIndex); string.substring(beginIndex, endIndex);
	        String s3 = "Programming";
	        System.out.println("substring(3): " + s3.substring(3));     // gramming
	        System.out.println("substring(0,4): " + s3.substring(0, 4)); // Prog




	        // 4. equals() / equalsIgnoreCase()
	        // Description: Compares two strings.
	        String s4a = "Java";
	        String s4b = "java";
	        System.out.println("equals: " + s4a.equals(s4b));                // false
	        System.out.println("equalsIgnoreCase: " + s4a.equalsIgnoreCase(s4b)); // true




	        // 5. compareTo() / compareToIgnoreCase()
	        // Description: Compares strings lexicographically.
	        String s5a = "apple";
	        String s5b = "banana";
	        System.out.println("compareTo: " + s5a.compareTo(s5b)); // negative




	        // 6. toUpperCase() / toLowerCase()
	        // Description: Converts case.
	        String s6 = "Hello";
	        System.out.println("toUpperCase: " + s6.toUpperCase()); // HELLO
	        System.out.println("toLowerCase: " + s6.toLowerCase()); // hello




	        // 7. trim()
	        // Description: Removes leading and trailing spaces.
	        String s7 = "  Java  ";
	        System.out.println("trim: '" + s7.trim() + "'"); // 'Java'




	        // 8. replace()
	        // Description: Replaces character or substring.
	        String s8 = "Java";
	        System.out.println("replace char: " + s8.replace('a', 'o'));   // Jovo
	        System.out.println("replace string: " + s8.replace("Java", "C")); // C




	        // 9. contains()
	        // Description: Checks if substring exists.
	        String s9 = "Programming";
	        System.out.println("contains 'gram': " + s9.contains("gram")); // true




	        // 10. startsWith() / endsWith()
	        // Description: Checks beginning/ending.
	        String s10 = "HelloWorld";
	        System.out.println("startsWith 'Hello': " + s10.startsWith("Hello")); // true
	        System.out.println("endsWith 'World': " + s10.endsWith("World"));     // true




	        // 11. indexOf()
	        // Description: Returns index of first occurrence.
	        String s11 = "Java Programming";
	        System.out.println("indexOf 'Prog': " + s11.indexOf("Prog")); // 5




	        // 12. lastIndexOf()
	        // Description: Returns last occurrence.
	        String s12 = "Java Java";
	        System.out.println("lastIndexOf 'Java': " + s12.lastIndexOf("Java")); // 5




	        // 13. isEmpty() / isBlank()
	        // Description: Checks if string is empty or blank.
	        String s13a = "";
	        String s13b = "   ";
	        System.out.println("isEmpty: " + s13a.isEmpty()); // true
	        System.out.println("isBlank: " + s13b.isBlank()); // true




	        // 14. split()
	        // Description: Splits string by delimiter.
	        String s14 = "a,b,c";
	        String[] arr = s14.split(",");
	        System.out.print("split: ");
	        for(String x : arr) System.out.print(x + " "); // a b c

	        System.out.println();




	        // 15. valueOf()
	        // Description: Converts data type to string.
	        int n = 100;
	        String s15 = String.valueOf(n);
	        System.out.println("valueOf: " + (s15 + 50)); // 10050



	    }
	

}
