class Test{
	
	int num;
	String name;
	
	// this would be invoked while an object
	// of that class is created
	Test(int num, String name){
		this.num = num;
		this.name = name;
	}
	
}


class ParameterizedConstructor{
	
	public static void main(String args[]){
		
		//this would invoke Parameterized constructor.
		Test t1 = new Test(5, "Ananth");
		
		System.out.println(t1.num);
		System.out.println(t1.name);
	}
}
