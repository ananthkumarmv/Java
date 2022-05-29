class Test{
	
	int num;
	String name;
	
	// this would be invoked while an object
	// of that class is created
	Test(){
		System.out.println("Constructor called");
	}
	
}


class DefaultConstructor{
	
	public static void main(String args[]){
		
		//this would invoke default constructor.
		Test t1 = new Test();
		
		System.out.println(t1.num);
		System.out.println(t1.name);
	}
}

	
	