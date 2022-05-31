// Java Program to Demonstrate Exception is Thrown
// How the runTime System Searches Call-Stack
// to Find Appropriate Exception Handler
  
// Class
// ExceptionThrown

class ExceptionHandler{
	
	static int divideByZero(int a, int b){
		
		// this statement will cause ArithmeticException 
		// (/by zero)
		int i = a/b;
		
		return i;
	}
	
	static int computeDivision(int a, int b){
		int res = 0;
		
		// Try block to check for exceptions
		try{
			res = divideByZero(a,b);
		}
		
		// Catch block to handle NumberFormatException
        // exception Doesn't matches with
        // ArithmeticException
		
		catch (NumberFormatException ex){
			// display message when exception occurs
			System.out.println("NumberFormatException is occurred");
		}
		return res;
	}
	
	
	// Method 2
    // Found appropriate Exception handler.
    // i.e. matching catch block.
	public static void main(String args[]){
		
		int a =1;
		int b=0;
		
		// try to cherck for exceptions
		try{
			int i = computeDivision(a,b);
		}
		
		// catch block to handle ArithmeticException exceptions
		catch(ArithmeticException ex){
			
			// getMessage() will print description
			// of exception(here / by zero)
			System.out.println(ex.getMessage());
		}
	}
}