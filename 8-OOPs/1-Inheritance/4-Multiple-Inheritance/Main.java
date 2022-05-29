interface one{
	public void print_geek();
}

interface two{
	public void print_for();
}

interface three extends one, two{
	public void print_geek();
}

class Child implements three{
	@Override public void print_geek()
	{
		System.out.println("Geeks");
	}
	
	public void print_for(){
		System.out.println("for");
	}
	
}


public class Main{
	public static void main(String args[])
	{
		Child c = new Child();
		c.print_geek();
		c.print_for();
		c.print_geek();
	}
}
