public class ByteOverflow{
	public static void main(String[]args){
		byte num =127;
		num =(byte)(num+1); // 127+1 = -128   
		
		
		System.out.println(num);
		
		//... -3 -2 -1 0 1 ... 125 126 127
                   //    |
                    //  +1  ↓
                   //   -128
				   
				   
				   
      byte num2 = 127;
	  num2 = (byte)(num2+2);
	  System.out.println(num2);
	  
	// Start: 127
//   |
//  +1
//   v
// -128   (overflow)
//   |
//  +1
//   v
// -127   (final answer)

byte num3 = 127;
num3 = (byte)(num3+3);
System.out.println(num3); // 127+3=-126  => -128,-127,-126 , so (final)=-126.
		
	}
}