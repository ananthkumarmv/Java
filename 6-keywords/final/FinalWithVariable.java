class FinalWithVariable{
	
	public static void main(String args[]){
		
		int a = 5;
		
		a++;
		
		final int b = 5;
		
		// compile time error
		b++;
	}
}