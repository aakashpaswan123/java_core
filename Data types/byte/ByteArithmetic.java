public class ByteArithmetic{
  public static void main(String[]args){
	  byte a = 10;
	  byte b = 20;
	  int c = a+b;
	  System.out.println(c); //Arithmetic on byte values is automatically promoted to int.
	  
	  byte a2 = 20;
	  byte b2 = 30;
	  //byte c2 = a2+b2;
	  //System.out.println(c2);    error: incompatible types: possible lossy conversion from int to byte
	  
	  byte c2=(byte)(a2+b2); // correct way
	  System.out.println(c2);
  }
}