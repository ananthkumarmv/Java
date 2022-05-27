class CreateArrays{
	public static void main(String... args){
		int []a;
		
		// first way
		a = new int[3];
		a[0] = 5;
		
		for(int i=0; i<a.length; i++)
				System.out.println(a[i] + " ");
			
		// second way
		// declaring as well as allocating
		int []b = new int [3];
		
		// array declaration, memory allocation and initialization 
		int c[] = {10, 20, 30};
		
		for(int i=0; i<c.length; i++)
				System.out.println(c[i] + " ");
		
	}
}
