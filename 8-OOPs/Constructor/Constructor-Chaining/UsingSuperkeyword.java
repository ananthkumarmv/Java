class Base{
	
	String name;
	
	// constructor 1
	Base(){
		this("");
		System.out.println("No-argument constructor of" +
                                           " base class");
    }
	
	// constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}


class UsingSuperkeyword extends Base{
	
	
	UsingSuperkeyword(){
		System.out.println("No-argument constructor " +
                           "of derived");
	}
	
	// parameterized constructor 4
	UsingSuperkeyword(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                           "constructor of derived");
    }
	
	public static void main(String args[])
    {
        // calls parameterized constructor 4
        UsingSuperkeyword obj = new UsingSuperkeyword("test");
 
        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}

