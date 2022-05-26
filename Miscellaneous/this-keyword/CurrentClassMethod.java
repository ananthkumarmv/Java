class Test{
	void display(){
		
		// calling function show()
		this.show();
		
		System.out.println("Inside display function");
	}
	
	void show(){
		System.out.println("Inside show function");
	}
	
}

class CurrentClassMethod{
	
	public static void main(String []args){
		
		Test obj = new Test();
		obj.display();
	}
}
	