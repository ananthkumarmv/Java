import java.util.Arrays;

class ArraysCompare{
	
	public static void main(String args[]){
		
		int arr1[] = {1,2,3,4};
		
		int arr2[] = {1,2,3, 4};
		
		// to compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(arr1, arr2));
	}
}