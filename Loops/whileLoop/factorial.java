public class factorial{
	public static void main(String[]args){
		int num =5;
		int fact = 1;
		int i =1;
		while(i<=num){
			fact=fact*i; 
			i++;
			// 1*1=1
			// 1*2=2
			// 2*3=6
			// 6*4=24
			// 24*5=120
		}
		System.out.println(fact); // 120
	}
}