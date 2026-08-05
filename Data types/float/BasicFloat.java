public class BasicFloat{
	public static void main(String[]args){
		//float is a primitive data type.
		//t stores decimal (floating-point) numbers.
		//Size: 4 bytes (32 bits)
		//Precision: About 6–7 decimal digits
		//Default value (instance variable): 0.0f
		//A float literal must end with f or F (e.g., 10.5f).
		
		float price = 99.99f;      // only 99.99 so compile error so require f.
		System.out.println(price);
		
		float num = (float)99.99; // if not include f so other method => explicit casting: (float)99.99
        System.out.println(num); 		
	}
}