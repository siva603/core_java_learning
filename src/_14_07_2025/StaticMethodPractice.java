package _14_07_2025;

public class StaticMethodPractice {
	
	/*
	 * class static area
	 * +-------------------+
	 * | a = 0
	 * | p s v m()
	 * | static void vara()
	 * +--------------------+
	 * StaticVariblePractice
	 * 
	 * 
	 * heap area
	 * ---------
	 * 
	 * unique address : ox1
	 * +-------------------+
	 * | 
	 * | 
	 * |
	 * +-------------------+
	 * obj = ox1
	 * 
	 */
	
	static int a;
	
	static void vara() {
		System.out.println("Pottidhi 😫😫😫😒😒😒");
	}
	
	
	public static void main(String[] args) {
		
		vara();
		
		StaticMethodPractice.vara();
		
		StaticMethodPractice obj = new StaticMethodPractice();
		obj.vara();
		
		
	}

}
