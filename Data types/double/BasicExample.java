public class BasicExample{
	public static void main(String[]args){
		//Size: 8 bytes (64 bits)
		//Default value (instance variable): 0.0
		//Range: लगभग ±1.7 × 10^308
		//Precision: लगभग 15–16 decimal digits
		
		double price = 99.99;
		System.out.println(price);
		
		
		// Area of circle
		double radius = 5.5;
		double area = 3.14159 * radius * radius;
		System.out.println("Area of circle: "+area);
		
		// post increment and pre increment.
		double d1 = 200;
		System.out.println(d1++); //200.0
		System.out.println(d1);   //201.0
		
		double d2 = 200;
		System.out.println(++d2); //201.0
		System.out.println(d2);  //201.0
	}

}