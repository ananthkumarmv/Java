class InstanceOfEx1{
	
	public static void main(String args[]){
		
		InstanceOfEx1 obj = new InstanceOfEx1();
		
		if(obj instanceof InstanceOfEx1){
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}