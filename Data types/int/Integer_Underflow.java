public class Integer_Underflow{
	public static void main(String[]args){
		//Range: -2,147,483,648 to 2,147,483,647
		
		int num = Integer.MIN_VALUE; //-2147483648 
		num--;
		System.out.println(num); //2147483647
		
		int num2 = Integer.MIN_VALUE;
		num2-=2;
		System.out.println(num2);//2147483646
	}
}