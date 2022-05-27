class Addition{
	int sum=0;
	
	int addTwoInt(int a, int b){
		
		sum = a + b;
		
		return sum;
	}
}

class Callingmethod{
	
	public static void main(String []args){
		
		Addition add = new Addition();
		
		int s = add.addTwoInt(1,2);
		
		System.out.println(s);
		
	}
}
