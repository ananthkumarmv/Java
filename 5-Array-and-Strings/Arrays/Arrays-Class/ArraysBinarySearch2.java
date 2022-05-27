import java.util.Arrays;

class ArraysBinarySearch2{
	
	public static void main(String []args){
		
		int arr[] = {1,4,3,6,8,2};
		
		Arrays.sort(arr);
		
		int key = 6;
		
		System.out.println("Found at " + Arrays.binarySearch(arr, 3, 5, key));
		
	}
}