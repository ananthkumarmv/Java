public class Autoboxing{
	public static void main(String args[]){
		// Converting int into Integer
		int a=400;
		
		//converting int into Integer explicitly
		Integer i = Integer.valueOf(a);
		
		//autoboxing, now compiler will write Integer.valueOf(a) internally  
		Integer j = a;
		
		System.out.println(a+" "+i+" "+j);
		
		if(i == j)
			System.out.println("Same");
		else 
			System.out.println("Different");
		
	}
}
