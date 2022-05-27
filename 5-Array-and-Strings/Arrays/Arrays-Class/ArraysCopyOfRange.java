import java.util.Arrays;


class ArraysCopyOfRange{
	
	public static void main(String []args){
		
		int arr1[] = {0,1,2,3,4,5,6};
		
		int arr2[] = Arrays.copyOfRange(arr1, 0, 5);
		
		System.out.print(Arrays.toString(arr2));
		
	}
}