public class Basic_short{
	public static void main(String[]args){
		//short is a primitive data type.
		//Size: 2 bytes (16 bits)
		//Range: -32,768 to 32,767
		//Default value (instance variable): 0
		//It is used when you need to save memory compared to int.
		
		short age = 24;
		System.out.println(age);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		short num = 40000; // compile error => 40000 is greater than 32767.
	}
}