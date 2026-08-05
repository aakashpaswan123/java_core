public class BasicExample{
	public static void main(String[]args){
		//long (Primitive Data Type)
		//Size: 64 bits (8 bytes)
		//Default value (instance variable): 0
		//Suffix: L ya l (capital L use karna better hai)
		
		long a = 100;  // small value ve L lgana jarrori nahi he.
		//long b = 5000000000; // compile error
		
		// so 
		long b = 5000000000L;
		System.out.println(a); //100
		System.out.println(b); //5000000000
		
		System.out.println(Long.MAX_VALUE); //9223372036854775807
		System.out.println(Long.MIN_VALUE); //-9223372036854775808
		
	}
}