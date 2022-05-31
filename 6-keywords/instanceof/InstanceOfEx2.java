class InstanceOfEx2{
	
	public static void main(String args[]){
		
		InstanceOfEx2 obj = null;
		
		if(obj instanceof InstanceOfEx2){
			System.out.println("Yes");
		}
		// else statement will be executed
		else System.out.println("No");
	}
}
