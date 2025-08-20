package _14_07_2025;

public class StaticVariblePractice {

	static int a ;
	int b;
	
	/*
	 * class static area
	 * +-------------------+
	 * | a = 0
	 * | p s v m(--);
	 * |
	 * +--------------------+
	 * StaticVariblePractice
	 * 
	 * 
	 * heap area
	 * ---------
	 * 
	 * unique address : ox1
	 * +-------------------+
	 * | b = 0
	 * | 
	 * |
	 * +-------------------+
	 * obj = ox1
	 * 
	 */
	public static void main(String[] args) {
		// local variable check (highest priority)
		// class static area
		
		System.out.println(a);
		
		int a = 20;
		
		System.out.println(a);
		System.out.println(StaticVariblePractice.a);
		
		StaticVariblePractice obj = new StaticVariblePractice();
		System.out.println(obj.a);
		
		// direct
		// className.variable
		// objectReference.variable
		 
		
		// construcor work
		// 1st super();
		// 2nd non static varables load with default value
		// 3rd non static methods
		// 4th non static blocks will exeucte in stack area
		// execute instructions which are present inside the constructor.
		 
	}
	
	
}
