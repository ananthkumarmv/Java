interface In1{
	
	final int a = 10;
	default void display(){
		System.out.println("hello");
    }
}
  

class DefaultInInterface implements In1{
	
	public static void main(String []args){
		
		DefaultInInterface d = new DefaultInInterface();
		
		d.display();
	}
}
