class ReturnArrFromMethod{
	
	public static void main(String []args)
	{
		int arr[] = m1();
		
		for(int item: arr){
			System.out.print(item + " ");
		}
	}
	
	public static int[] m1(){
		
		//int a[] = {1,2,3,4};
		
		//return a;
		
		return new int[]{1,2,3};
	}
}
