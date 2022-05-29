class Test{
	{
		System.out.println("Init Block");
	}
	
	Test(){
		System.out.println("Constructor");
	}
	
}
class InitBlock{
	
	public static void main(String []args){
		
		Test t1 = new Test();
	}
}
