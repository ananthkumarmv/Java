final class FinalKeyword{
	
	// by default it is final
	void h(){}
	
	// by default it is not final
	static int j = 0;
	
	public static void main(String[] args)
    {
        // modified contents of variable j.
        j = 36;
        System.out.println(j);
    }
}
