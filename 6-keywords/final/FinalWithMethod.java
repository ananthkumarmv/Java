class FinalWithMethod{
	
	final void rr(){}
	
	public static void main(String []args){
	}
	
}



class MM extends FinalWithMethod{
	// Here we get compile time error
    // since can't extend rr since it is final.
	@Override
    void rr() {}
}
