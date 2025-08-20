package _14_07_2025;

public class Student {

	String name; // non static variables
	int id;
	int age;
	String branch;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println(s1.branch);
		
		s1.name = "vara";
		s1.age = 22;
		s1.id = 1;

		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println(s1.branch);
	}
	
/*	  heap area
	 * ---------------
	 * 
	 * unique address : ox1
	 * +-------------------+
	 * | name = null
	 * | id = 0
	 * | age = 0
	 * | branch = null
	 * +-------------------+
	 * s1 = ox1
 */
}
