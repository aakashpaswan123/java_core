public class shortOverflow{
	public static void main(String[]args){
		//Range: -32,768 to 32,767
		
		short s = 32767;
		s++;
		System.out.println(s);  //-32768
		
		short s2 = 32767;
		s2+=2;
		System.out.println(s2); // -32767
		
	}
}