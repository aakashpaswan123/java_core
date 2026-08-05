public class Integer_Overflow{
 public static void main(String[]args){
	 //Range: -2,147,483,648 to 2,147,483,647
	 
	 int num = Integer.MAX_VALUE; //2147483647
	 num++;
	 System.out.println(num);  // -2,147,483,648 
	 
	 int num2 = Integer.MAX_VALUE;
	 num2+=2;
	 System.out.println(num2); // -2,147,483,647 
	 
 }
}