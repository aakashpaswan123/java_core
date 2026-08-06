import java.util.Scanner;
public class ArrayInputFrom_user{
	public static void main(String[]args){
		
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[5]; // array Size
		
		System.out.println("Enter 5 Numbers:");
		
		for(int i=0; i<arr.length; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println("Your Array Elements: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}