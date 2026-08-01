public class StringExample1{
	public static void main(String[]args){
		
		//String ka use multiple characters (text) store karne ke liye hota hai.
       //Double Quotes (" ") ke andar likha jata hai.
	   
	   String name ="Aakash";
	   System.out.println(name);
	   
	   String city ="Delhi";
	   System.out.println("I live in "+city);
	   
	   //concatenate
	   String a ="Hello ";
	   String b ="World";
	   System.out.println(a+b); // Hello World
	   
	   int n1=10;
	   String n2="20";
	   System.out.println(n1+n2); //1020
	   
	   String n3 ="30";
	   int n4 = 20;
	   System.out.println(n3+n4);
	   
	   
	   //Convert a String to int using Integer.parseInt() when you need arithmetic
	   String n5 = "12";
       String n6 = "3";
	   int sum = Integer.parseInt(n5) + Integer.parseInt(n6);
	   System.out.println(sum);
	   
	   
	}
}