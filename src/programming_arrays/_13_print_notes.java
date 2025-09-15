package programming_arrays;

public class _13_print_notes {

	/**
	 * Q: You are given an integer amount and an array of currency denominations
	 * such as {1000, 500, 200, 100, 50, 20, 10, 5, 1}.
	 * Write a program to count the minimum number of notes required for the amount.
	 *
	 * Example:
	 * Input: amount = 2896
	 * Output:
	 * 1000 : 2
	 * 500  : 1
	 * 200  : 1
	 * 100  : 1
	 * 50   : 1
	 * 20   : 2
	 * 5    : 1
	 * 1    : 1
	 */

	
    public static void countNotes(int amount) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 1};

        System.out.println("Amount: " + amount);
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;  // how many notes of this type
                amount = amount % note;     // remaining amount
                System.out.println(note + " : " + count);
            }
        }
    }

    public static void main(String[] args) {
        int amount = 2896;  // Example input
        countNotes(amount);
    }
}
