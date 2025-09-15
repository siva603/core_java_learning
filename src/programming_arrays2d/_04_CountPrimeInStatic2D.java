package programming_arrays2d;

public class _04_CountPrimeInStatic2D {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Static 2D array
        int[][] arr = {
            {2, 4, 5},
            {6, 7, 8},
            {11, 13, 14}
        };

        int primeCount = 0;

        // Count prime numbers
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])) {
                    primeCount++;
                }
            }
        }

        // Print result
        System.out.println("Total prime numbers in the 2D array: " + primeCount);
    }
}

