import java.util.*;

class Fruit{
	
	
	public Fruit(){
		
		System.out.println("Super class constructor");
		
		System.out.println("Super class object hashcode: " +
							this.hashCode());
		
		System.out.println(this.getClass().getName());
		
	}
}


class Apple extends Fruit{
	
	public Apple(){
		
		System.out.println("Subclass constructor invoked");
 
        // Displaying object hashcode of sub class
        System.out.println("Sub class object hashcode :" +
                           this.hashCode());
						   
		System.out.println(this.hashCode() + " " +
							super.hashCode());
							
		System.out.println(this.getClass().getName() + " " +
							super.getClass().getName());
		
	}
}
 

class ObjectCreationOfInheritedClass{
	
	public static void main(String[] args){
	
		Apple myApple = new Apple();
	}
}