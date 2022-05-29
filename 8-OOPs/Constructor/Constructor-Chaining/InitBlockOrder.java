class Test{
	{
		System.out.println("Init Block-1");
	}
	
	Test(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Init Block-2");
	}
	
}
class InitBlockOrder{
	
	public static void main(String []args){
		
		Test t1 = new Test();
	}
}
