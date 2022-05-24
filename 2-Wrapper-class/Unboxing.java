public class Unboxing{
	public static void main(String args[]){
		//Converting Integer to int
		Integer a = 3;
		
		// Converting Interger to int explicitly
		int i = a.intValue();
		
		// unboxing, now compiler will write a.intValue() internally
		int j = a;
		
		System.out.println(a+" "+i+" "+j);
	}
}