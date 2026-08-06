public class Demo{
public static void main(String[]args){
	           // 0  1    2   3   4
	int[] arr = {50,100,150,200,300};
	int removeIndex = 3; // index 3 => 200 remove hoga.
	
	//Left side
	for(int i= removeIndex; i<arr.length-1; i++){
		arr[i] = arr[i+1];
		// 3=>4
	}
	// new size 
	int newSize = arr.length-1;
	for(int i=0; i<newSize; i++){
		System.out.print(arr[i]+" "); //50 100 150 300
	}
	
 }
}