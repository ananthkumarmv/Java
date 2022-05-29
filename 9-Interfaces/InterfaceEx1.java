// A simple interface

interface In1{
	
	// public static and final
	final int a = 10;
	
	// public and abstract
	void display();
}

// A class that implements the interface
class InterfaceEx1 implements In1{
	
	// Implementing the capabilities of interface.
	public void display(){
		System.out.println("Ananth");
	}
	
	public static void main(String []args){
		
		InterfaceEx1 t = new InterfaceEx1();
		t.display();
		System.out.println(a);
	}
}