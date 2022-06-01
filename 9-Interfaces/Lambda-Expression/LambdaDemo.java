interface A{
	
	void show();
}



class LambdaDemo{
	
	public static void main(String[] args){
		A obj;
		//obj = new A(){   // Anonymous Inner Class
		
		//	public void show(){
		//		System.out.println("Hello");
		//	}
		//};

		obj = () -> System.out.println("Hello");
		
		obj.show();
	}
}

