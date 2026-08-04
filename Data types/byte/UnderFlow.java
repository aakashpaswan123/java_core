public class UnderFlow{
	public static void main(String[]args){
		byte num = -128;
		num--;
		System.out.println(num);  
		// Range of byte data type: -128 to 127
        // -128  -->  -1  -->  127
		
		byte num2 = -128;
		num2 = (byte)(num2-2);
		System.out.println(num2); 
		// -128 --> -2 ---> 126
	}
}