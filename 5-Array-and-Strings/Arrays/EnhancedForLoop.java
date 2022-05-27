class EnhancedForLoop{
	
	public static int sum(int[] arr){
		int sum=0;
		
		for(int item: arr){
			sum += item;
		}
		return sum;
		
	
	public static void main(String[] args){
		
		int[] a = {1,2,3};
		
		for(int item: a)
				System.out.print(item + " ");
			
		System.out.print("\nSum = " + sum(a));
			
	}
}