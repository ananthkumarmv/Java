class Test{
	int a,b;
	
	Test(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void display(){
		System.out.print(a + " " + b);
	}
}


class CurrentClassInstanceVar{
	
	public static void main(String... args){
		Test t = new Test(10, 20);
		t.display();
	}
}
