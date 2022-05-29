class Test{
	
	Test(){
		System.out.println("Default");
	}
	
	
	Test(int x){
		this();
		System.out.println(x);
	}
	
	
	Test(int x, int y){
		this(x);
		System.out.println(x*y);
	}
	
}



class ConstructorChainingEx1{
	
	public static void main(String []args){
		
		Test t1 = new Test(3,4);
	}
}
