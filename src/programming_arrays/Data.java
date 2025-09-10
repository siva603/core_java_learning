package programming_arrays;

/*
 * Array :
 * --------
 * what is array 
 * ------------- 
 * 
 * array is continue block of memory. this is used to we can store mutliple
 * values in a single variable.
 * 
 * Fixed Length: Once an array is created, its size is fixed and cannot be changed.
 * 
 * Homogeneous Elements: All elements within an array must be of the same data type.
 * 
 * if you want to access that elements, we can use index( staring from 0 to N-1)
 * 	where N is the size of the array.
 * 
 * why we need arrays
 * ------------------
 * 
 * in java, we can store a single value to a variable
 * so to store multiple values in a single variable we are using arrays
 * 
 * how we can create arrays
 * ------------------------
 * 
 * in java we can create array in two ways
 * 
 * 		1. directly
 * 		2. using new keyword.
 * 
 * arrays are two type :
 * --------------------
 * 
 * 1. single dimensional array
 * 2. mutli dimensional array
 * 
 * Single dimensional array
 * ========================
 * 
 * here an array elements means values
 * 
 * systax:
 * ------
 * 
 * datatype[] variableName = { value, value2, value3, ....}
 * 
 * datatype[] variableName = new datatype[size];
 * 			or
 * datatype variableName[] ....
 * 			or
 * datatype []variableName ....
 * 
 * example :
 * ---------
 * int[] num = {10, 20, 30};
 * 
 * System.out.println( num.length ) // output is 3
 * System.out.println( num[0] ) ; // output is 10
 * System.out.println( num[1] ) ; // output is 20
 * System.out.println( num[2] ) ; // output is 30
 * 
 * if you observe the above to access the elements or values of an array 
 * we are using indexes like 0 , 1, 2 so these number are continue 0 to N-1
 * where N is length of an array
 * 
 *	for ( int i=0 ; i<num.length ; i++ ) {
 *
 *		System.out.println( num[i] );
 *
 *	}
 *
 * to access elements loops are very important.
 * 
 * 
 * Taking values from user 
 * =======================
 * 
 * Scanner sc = new Scanner(System.in);

        // Ask user for array size
         
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        // Create the array
         
        int[] arr = new int[size];

        // Take input for each element with clear message
         
        System.out.println("\nEnter elements of the array:");
       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // Print the array
         
        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index [" + i + "] = " + arr[i]);
        }


 *
 *
 *
 *Mutli dimensional arrays
 *-----------------------
 *A collection of arrays arranged in multiple dimensions (like rows and columns).
 *
 *here elements are an single dimensional arrays
 *
 * syntax:
 * -------
 * 
 * datatype[][] variableName = { {v1, v2, v3}, 
 * 								 {v4, v5, v6},
 * 								 {v7, v8, v9} } ;
 *
 *  int[][] matrix =  {
    					{1, 2, 3},
    					{4, 5, 6},
    					{7, 8, 9}
					  };
					 
 *
 *  Row 0 → 1   2   3  
 *  
    Row 1 → 4   5   6  
    
    Row 2 → 7   8   9  

 *
 *
 *   matrix.length = 3 (length of rows)

     matrix[0].length = 3 (length of columns)
     
     
 *
 * System.out.println( matrix[0][0] ) // output is 1
 * System.out.println( matrix[0][1] ) // output is 2
 * System.out.println( matrix[0][2] ) // output is 3
 * 
 *
 * 	for (int i = 0; i < matrix.length; i++) {           // loop for rows
    
    		for (int j = 0; j < matrix[i].length; j++) {    // loop for columns
    		
        			System.out.print(matrix[i][j] + " ");
        			
    		}
    		
    		System.out.println();   // move to next line after each row
	}

 *
 * Taking input from user
 * ---------------------
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int[][] matrix = new int[3][3];
 * 
 * System.out.println("\nEnter elements of the matrix:");
 * 
        for (int i = 0; i < matrix.length ; i++) {
        
            for (int j = 0; j < matrix[0].length ; j++) {
            
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                
            }
        }
 *
 * 
 * 
 */
public class Data {
	
}
