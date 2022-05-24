class Format{
	
	public static void main(String... args){
		int x=100, y=200;
	
		System.out.format("Value of x is: %d\n", x);
		
		float pi = (float)Math.PI;
		System.out.println(y);
		
		System.out.format("Value of PI is: %.2f\n", pi);
		
		System.out.format("Value of PI is: %5.2f\n", pi);
		
		System.out.format("Value of PI is: %05.2f\n", pi);
		
		System.out.printf("x = %d, y = %f", x, pi);
		
	}
}
