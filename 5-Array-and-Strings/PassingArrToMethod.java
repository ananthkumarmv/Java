class PassingArrToMethod{
	public static void main(String []args){
	
	int arr[] = {1,2,3,4};
	
	sum(arr);
	}
	
	public static void sum(int[] arr){
		
		int sum = 0;
		
		for(int item: arr)
			sum += item;
		
		System.out.print(sum);
	}
	
}
