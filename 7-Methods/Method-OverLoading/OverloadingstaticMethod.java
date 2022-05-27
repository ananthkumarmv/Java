class OverloadingstaticMethod{
	
	public static void foo(){
		System.out.println("OverloadingstaticMethod.foo() called");
	}
	
	public static void foo(int a){
		System.out.println("OverloadingstaticMethod.foo(int) called");
	}
	
	public static void main(String args[]){
		OverloadingstaticMethod.foo();
		OverloadingstaticMethod.foo(5);
	}
}
