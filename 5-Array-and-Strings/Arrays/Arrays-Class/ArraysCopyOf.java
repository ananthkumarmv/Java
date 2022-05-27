import java.util.Arrays;

class ArraysCopyOf{
	
	public static void main(String args[]){
		int arr[] = {1,2,3};
		
		int arrcpy[] = Arrays.copyOf(arr, 5);
		
		for (int i = 0; i < arrcpy.length; i++) 
           System.out.print(arrcpy[i] + " ");
	   
	}
}
