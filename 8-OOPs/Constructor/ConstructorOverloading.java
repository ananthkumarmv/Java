class Test{
	

	Test(int num, String name){
		System.out.println(num + " " + name);
	}
	
	Test(String str){
		System.out.println(str);
	}
	
	Test(double d){
		System.out.println(d);
	}
	
	
}


class ConstructorOverloading{
	
	public static void main(String args[]){
		
		Test t1 = new Test(5, "Ananth");
		
		Test t2 = new Test("Ananth");
		
		Test t3 = new Test(5.9);
	}
}
