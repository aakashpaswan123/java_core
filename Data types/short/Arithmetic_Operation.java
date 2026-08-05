public class Arithmetic_Operation{
	public static void main(String[]args){
		short a = 100;
		short b = 200;
		int c = a+b;           //In Java, arithmetic operations on short are automatically promoted to int.
		System.out.println(c);
		
		short a2 = 300;
		short b2 = 200;
		short c2 =(short)(a2+b2);
		System.out.println(c2);
	}
}