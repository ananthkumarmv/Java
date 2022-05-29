interface PI1{
	
	
	default void show(){
		
		// Print statement if method is called
        // from interface 1
		System.out.println("Default PI1");
    }
}

interface PI2 {
 
    // Default method
    default void show()
    {
 
        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}


class DefaultMethod implements PI1, PI2{
	
	
	public void show()
    {
		// Using super keyword to call the show
        // method of PI1 interface
		PI1.super.show();
		
		// Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
	}
	
	 public static void main(String args[])
    {
 
        // Creating object of this class in main() method
        DefaultMethod d = new DefaultMethod();
        d.show();
    }
}
