class Test{
	int a;
	int b;
	
	// Default constructor
	Test(){
		this(10, 20);
		System.out.println("Inside default constructor \n");
	}
	
	Test(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}
}

class CurrentClassConstructor{
	
	public static void main(String []arg){
		Test object = new Test();
	
	}
}
	