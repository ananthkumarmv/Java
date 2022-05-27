class Test{
	public static int i = 0;
	
	Test(){
		i++;
	}
	
	// Method 1
	// to access static emebers of the class and for getting
	// total no of objects of the same class created so far
	public static int get(){
		return i;
	}
	
	public int m1(){
		
		// Display msg only
		System.out.println("Inside the method m1 by object of Test class");
		
		// calling m2 within the same class
		this.m2();
		
		// statements to be executed if any
		return 1;
		
	}
	
	public void m2(){
		System.out.println("In method m2 came from method m1");
	}
}

class CallingMethod2{
	public static void main(String args[]){
		
		Test obj = new Test();
		
		int i = obj.m1();
		
		int no_of_objects = Test.get();
		
		System.out.print(
            "No of instances created till now : ");
       
        System.out.println(no_of_objects);
	}
}