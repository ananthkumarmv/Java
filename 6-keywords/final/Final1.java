class Final1{
	
	public static void main(String args[]){
		
		// creating an object of StringBuilder class
		// Final reference variable
		final StringBuilder sb = new StringBuilder("Ananth");
		
		System.out.println(sb);
		
		// changing internal state of object reference by
		// final reference variable sb
		sb.append(" Kumar");
		
		// Again printing the element in StringBuilder
		// object after appending above element in it
		System.out.println(sb);
	}
}
