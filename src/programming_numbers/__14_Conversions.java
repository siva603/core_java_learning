package programming_numbers;

public class __14_Conversions {

	
	static void toBinary() {
		
		// 1 0 0
		// 4/2 -> 0 
		// 2/2 -> 0
		// 1   -> 1
		
		int n = 4;
		
		String res = "";
		
		while(n!=0) {
			res = n%2 + res;
			n/=2;
		}
		
		System.out.println("binary code : " + res);
		
	}
	
	static void toOctal() {
		
		int n = 4;
		
		String res = "";
		
		while(n!=0) {
			res = n%8 + res;
			n/=8;
		}
		
		System.out.println("octal code : " + res);
		
	}
	
	static void toHexaDecimal() {
		
		int n = 4;
		
		String res = "";
		
		while(n!=0) {
			res = n%16 + res;
			n/=16;
		}
		
		System.out.println("octal code : " + res);
		
	}
	
	public static void main(String[] args) {
		
		toBinary();
	}
	
}
