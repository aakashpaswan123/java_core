public class BasicExample{
	public static void main(String[]args){
		//int is a primitive data type.
		//Size: 4 bytes (32 bits)
		//Range: -2,147,483,648 to 2,147,483,647
		//Default value (instance variable): 0
		//It is the most commonly used integer data type in Java.
		
		int age = 24;
		System.out.println(age);
		
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
	}
}