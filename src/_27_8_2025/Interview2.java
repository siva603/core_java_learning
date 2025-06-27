package _27_8_2025;

class A{
	A(){
		System.out.println("Hi from A");
	}
}

class B{
	private B(){
		System.out.println("Hi from B");
	}
}

class C{
	C(){
		System.out.println("Hi from c");
	}
}


public class Interview2 {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
	}

}
