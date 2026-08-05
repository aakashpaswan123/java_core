public class Character_Example{
	public static void main(String[]args){
		//Java में char (character) एक primitive data type है जो single Unicode character को store करता है।
		//Size: 2 bytes (16 bits)
		//Range: '\u0000' (0) से '\uffff' (65535)
		//Default value: '\u0000'
		
		char ch ='A';
		System.out.println(ch);
		
		//Digit as character
		char num ='9';
		System.out.println(num);
		
		//special character
		char special ='#';
		System.out.println(special);
		
		//Unicode Character 
		//char unicode = '\u0905';   // ? ke bjay ==> अ aana chahiye //but अगर console का font Hindi characters को support नहीं करता, तो ? दिखाई देगा।
		//System.out.println(unicode);
		
	
		
		//ASCII value
		char asci =65;
		System.out.println(asci); // A
		asci++;
		System.out.println(asci); // B
		
		char unicode5 = '5';
		int x = unicode5;
		System.out.println(x); // 53  
		
		//ch
       //----
      //'5'
     //↓
    //Unicode Value = 53
	
		
	}
}