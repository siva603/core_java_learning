package _30_6_2025;

public class _6_OOPS {

	/*
	 * OOPS stands for object oriented programming language.
	 * java is object oriented programming language(99%). because of primitive data types
	 * 
	 * it is provide a mechanism to convert real word entity(person, bottle, bag...) to object entity.
	 * 
	 * In oops we write programs by using class and object
	 * 
	 * class person{
	 * 
	 * }
	 * 
	 * --------------------------------------------------------
	 * 
	 * 
	 * class : 
	 * --------
	 * 
	 * 	it is blueprint of object.
	 * 	it is keyword.
	 *  it is logical entity
	 * 	it is mainly used for 2 purpose
	 * 
	 * 		1. to execute the program
	 * 		2. to create the blueprint for object
	 * 
	 * 				syntax : for create class
	 * 
	 * 				class ClassName{
	 * 
	 * 						// block of code 
	 * 				}
	 * 
	 * 
	 * members of class
	 * ----------------
	 * members of class is divided into 3 types
	 * 
	 * 	1. variables
	 *  2. methods
	 *  3. blocks
	 *  
	 *  types of members
	 *  --------------------------------
	 *  
	 *  1. static members
	 *  ------------------
	 *  	1. static variable
	 *  	2. static methods
	 *  	3. static blocks
	 *  
	 *  
	 *  2. non static members
	 *  ---------------------
	 *  1. non static variables
	 *  2. non static methods
	 *  3. non static blocks
	 *  4. constructor
	 *  
	 *  
	 *  1. static variable : ( 10 questions )
	 *  ------------------
	 * what ->  A variable which is declare prefix with static keyword and inside  class and outside the blocks.
	 *  is known is static variables.
	 *  
	 *  why -> it used when we want to store single copy
	 *  
	 *  how -> syntax ->  static datatype variableName = value;
	 *  
	 *  				  static int a ;
	 *  
	 *  
	 *  before utilization, initialization is not mandatory. because variable will 
	 *  load with default value based on datatype during class loading process.
	 *  
	 *  	byte, short, int, long -> default value = 0
	 *  
	 *  	float , double -> default value = 0.0
	 *  
	 *  	boolean -> false
	 *  
	 *  	non-primitive datatype -> null
	 *  
	 *  static variables we can access in three ways.
	 *  -------------------------------------------
	 *  	1. by using direct variable name
	 *  	2. by using ClassName.variableName
	 *  	3. by using objectReference.variableName
	 *  
	 *  
	 *  class loading process :
	 *  -----------------------	
	 *  when we execute a java program, before jvm calls main method, jvm sub component 
	 *  class loader will load the static members into class static area is known as class loading process.
	 *  
	 *  class loader will load 	1st static variables and 2nd static methods.3rd static blocks
	 *  
	 *  jvm will execute static blocks from top to bottom order before calling the main method.(stack area)
	 *  
	 *  class loading process will happen only once. so static variables will load only
	 *  once.
	 *  
	 *  
	 *  
	 *  
	 *  2. static methods ( 10 questions) :
	 *  ------------------
	 * what ->  A method which is declare prefix with static keyword and inside  class.
	 *  is known is static method.
	 *  
	 *  why -> it used when we have common behavior
	 *  
	 *  how -> syntax -> 
	 *  
	 *  	access-modifiers	static 	returntype	methodName	(parameters){
	 *  
	 *  	// block of code;
	 *  
	 *  	}
	 *  
	 *  class loading process will happen only once. so static method loading process
	 *  will happens only once.
	 *  
	 *  
	 *  static methods we can access in three ways.
	 *  -------------------------------------------
	 *  	1. by using direct method name
	 *  	2. by using ClassName.methodName
	 *  	3. by using objectReference.methodName
	 *  
	 *  
	 *  3. static blocks ( 10 questions) :
	 *  ------------------
	 * what ->  A block which is declare prefix with static keyword and inside  class.
	 *  is known is static block.
	 *  
	 *  why -> it used when we want to execute important instructions before main method execution start.
	 *  
	 *  how -> syntax -> 
	 *  
	 *  	static {
	 *  
	 *  	// block of code;
	 *  
	 *  	}
	 *  
	 *  class loading process will happen only once. so static blocks will be  execute
	 *  from top to bottom order only once.
	 *  
	 *  
	 * 
	 * object (10 questions without constructors): 
	 * --------
	 * 
	 * it is instance of class
	 * it is physical entity
	 * object is a real word entity 
	 * which has properties(non-static variables ) | and behaviors (non - static methods)
	 * 
	 * 		examples for properties(variables):	   | examples for behaviors(methods)
	 * 
	 * 				name, age, gender			   | sleep, eat, walking, talking
	 * 
	 * for a class we can create no of objects 
	 * 
	 * why we called class is blueprint of object ?
	 * ---------------------------------------------
	 * 
	 * 			-> because we can write properties and behaviors only within the class.
	 * 
	 * 				syntax : to create object for class
	 * 
	 * 						ClassName ReferenceVariableName = new ClassName();
	 * 
	 * Note : 
	 * ---------
	 * non-static members we can access only using object reference variable only.
	 * 
	 * 
	 * 
	 * Constructor( 10 constructors with constructors):  --> ClassName();, new --> keyword
	 * -------------
	 * it is special non static method 
	 * 
	 * it is used to create object inside heap area and initialize object properties with defalut values;
	 * 
	 * 	constructor functionalities or works
	 * ---------------------------------------
	 * 
	 * 			1. it calls the super class constructor.
	 * 			2. it will load the class all non-static members to object.
	 * 			3. it will initialize default values for non-static variables.
	 * 			4. after it will execute instructions which are present inside the method.
	 * 
	 * types of constructors:
	 * ---------------------
	 * 	
	 * 	1. default defined constructor(5 questions): 
	 * 	-------------------------
	 * 		if we programmer fails to add constructor compiler will add automatically 
	 * 		create non-parameterized constructor with empty implementation.
	 * 
	 * 			Human(){
	 *				super();
	 * 			// empty implementation
	 * 			}
	 * 
	 * 2. user defined constructor( 10 questions):
	 * -----------------------------
	 * 
	 * 		if constructor is created by programmer that compiler called user defined constructor.
	 * 
	 * 		user defined constructor can be 2 types
	 * 		------------------------------------
	 * 		
	 * 		1. parameterized constructor ( it has at least one parameter)
	 * 		2. non-parameterized constructor ( zero parameters)
	 * 
	 * 
	 * 
	 * 
	 * --> Constructors overloading(5 questions):
	 * --------------------------------------------
	 * the process of creating multiple constructors with different parameters.
	 * different paramters means -> 1. datatype parameters
	 * 								2. length parameters
	 * 								3. order parameters
	 * 
	 * why-> constructor overloading is used we can user friendly application
	 * 
	 * 
	 * 
	 * 
	 * 
	 * --> Constructor chaining( 10 questions overcome the problem with multiple constructors code): 
	 *	 -------------------------------------------------------------------------------
	 *
	 *		the process of one constructor inside another constructor is known as constructor chaining.
	 * 
	 * 		we can achieve constructor chaining in two ways
	 * 	
	 * 			1. this() statement
	 * 			2. super() statement
	 * 
	 * this()
	 * ------
	 * 
	 * 	--> this is method calling statement
	 * --> we should write this statement inside the constructor only.
	 * --> for one constructor we can use only one this() statement
	 * --> we should write 1st line in the constructor this() statement.
	 * --> if we have n of constructors we can write n-1 this() statements only.
	 * --> method overloading is mandatory for this() statement. 
	 * --> Inheritance is not mandatory for this() statement.
	 * 
	 * --> this() statement is used we can reduce the no lines in constructor.
	 * 
	 * 
	 * 
	 * more questions 
	 * ----------------
	 * 
	 * 1. create a object for human.
	 * 
	 * 		steps:
	 * 		-----
	 * 			1. we should create class for human
	 * 			2. after we can create object for human
	 * 
	 * 
	 * 		class Human{ // creating class
	 * 				int age;
	 * 				String name;
	 * 		}
	 * 
	 * 2. creating object in another class
	 * 
	 * 		class Main{
	 * 
	 * 			public static void main(String arg[]){
	 * 			
	 * 				Human h = new Human(); // creating object
	 * 			}
	 *		}
	 *
	 *
	 * non -static members 
	 * ===============================================
	 * 
	 * 
	 *
	 *  1. non-static variable : ( 10 questions )
	 *  ------------------
	 * what ->  A variable which is not declare prefix with static keyword and inside  class and outside the blocks.
	 *  is known is non static variables.
	 *  
	 *  why -> it used when we want to store multiple copies.
	 *  
	 *  how -> syntax ->   datatype variableName = value;
	 *  			 int a = 10;
	 *  
	 *  
	 *  before utilization, initialization is not mandatory. bacause vairalbe will 
	 *  load with default value based on datatype during object loading process.
	 *  
	 *  	byte, short, int, long -> default value = 0
	 *  
	 *  	float , double -> default value = 0.0
	 *  
	 *  	boolean -> false
	 *  
	 *  	non-primitive datatype -> null
	 *  
	 *  static variables we can access only one way
	 *  -------------------------------------------
	
	 *  	1. by using objectReference.variableName only
	 *  non-static context ( non-static methods, constructors , non-statick blocks) 
	 *  	2. inside non-static context we can access directly using variablename
	 *  
	 *  
	 *  object loading process->
	 *  -----------------------	
	 *  
	 *  when we create an object, constructor will invoke(calls) automatically it will load the all 
	 *  non-static members of class into particular object inside the heap area is known as 
	 *  object loading process.
	 *  
	 *  we can create n number of objects for class, so object loading process will happen each and every
	 *  object creation.
	 *  
	 *  
	 *  2. non-static methods ( 10 questions) :
	 *  ------------------
	 * what ->  A method which is not declare prefix with static keyword and inside  class.
	 *  is known is non-static method.
	 *  
	 *  why -> it used to we can access non-static members directly.
	 *  
	 *  how -> syntax -> 
	 *  
	 *  	access-modifiers 	returntype	methodName	(parameters){
	 *  
	 *  	// block of code;
	 *  
	 *  	}
	 *  
	 *  
	 *  
	 *  3. non-static blocks ( 10 questions) :
	 *  ------------------
	 * what ->  A block which is not declare prefix with static keyword and inside  class.
	 *  is known is static block.
	 *  
	 *  why -> it used when we want to execute important instructions before object creation.
	 *  
	 *  how -> syntax -> 
	 *  
	 *  	 {
	 *  
	 *  	// block of code;
	 *  
	 *  	}
	 *  
	 *  object loading process will happen for each object creation. so non-static blocks will be  execute
	 *  for each object creation from top to bottom order.
	 *  
	 *  
	 * 
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */
	
}
