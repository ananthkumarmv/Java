class Test{
	
	int a;
	int b;
	
	Test(){
		a = 10;
		b = 20;
	}
	
	// method that returns current class instance
	Test get(){
		System.out.println(this);    // prints Test@4617c264
		return this;
	}
	
	void display(){
		System.out.println(a + " " + b);
	}
}



class ReturnCurrentClassInstance{
	
	public static void main(String args[]){
		
		Test object = new Test();
		object.get().display();
	}
}
