package inheritence;

class Course {
	String courseName;
	String courseCode;
	int enrollmentLimit;
	
	public Course(String courseName) {
		this.courseName = courseName;
		courseCode = "UNSET";
		enrollmentLimit = 100;
	}
	
	public Course(String courseName,String courseCode) {
		this(courseName,courseCode,100);
	}
	
	public Course(String courseName, String courseCode, int enrollmentLimit) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.enrollmentLimit = enrollmentLimit;
	}
	
	
	public void displayDetails() {
		System.out.println("course name : " + courseName);
		System.out.println("course code : " + courseCode);
		System.out.println("enrollement limit : " + enrollmentLimit);
	}
	
}
public class Main2 {
	public static void main(String[] args) {
		
		Course c = new Course("java");
		c.displayDetails();
		
	}
}
