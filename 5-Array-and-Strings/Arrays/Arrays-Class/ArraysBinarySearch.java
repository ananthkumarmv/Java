import java.util.Arrays;

class ArraysBinarySearch{
	public static void main(String []args){
		
		int arr[] = {1,3,6,2,7,9};
		
		Arrays.sort(arr);
		
		int key = 2;
		
		System.out.println(key + " found at index = " + Arrays.binarySearch(arr, key));
	}
}