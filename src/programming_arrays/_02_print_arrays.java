package programming_arrays;
import java.util.Arrays;

public class _02_print_arrays {

	    int[] numbers = {10, 20, 30, 40, 50};

	    // 1. Using for loop
	    public void printWithForLoop() {
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }
	    }

	    
	    
	    // 2. Using enhanced for-each loop
	    public void printWithForEach() {
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }

	    
	    
	    // 3. Using while loop
	    public void printWithWhileLoop() {
	        int i = 0;
	        while (i < numbers.length) {
	            System.out.println(numbers[i]);
	            i++;
	        }
	    }
	    
	    
	    

	    // 4. Using do-while loop
	    public void printWithDoWhileLoop() {
	        int i = 0;
	        do {
	            System.out.println(numbers[i]);
	            i++;
	        } while (i < numbers.length);
	    }
	    
	    

	    // 5. Using Arrays.toString()
	    public void printWithArraysToString() {
	        System.out.println(Arrays.toString(numbers));
	    }

	    
	    
	    // 6. Using Arrays.stream().forEach()
	    public void printWithStreamForEach() {
	        Arrays.stream(numbers).forEach(System.out::println);
	    }

	    
	    
	    // 7. Using Arrays.stream().boxed().collect()
	    public void printWithStreamCollect() {
	        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
	    }
	

}
