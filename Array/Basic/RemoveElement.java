public class RemoveElement{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,50};
		int removeIndex=2; // 30 remove hoga
		
		//Left side
		for(int i =removeIndex; i<arr.length-1; i++){
			arr[i] = arr[i+1];
			
		}
		// New size
		int newSize = arr.length-1;
		
		System.out.println("After Removing: ");
		
		for(int i=0; i<newSize; i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}