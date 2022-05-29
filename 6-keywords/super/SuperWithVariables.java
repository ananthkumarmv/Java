class Vehicle{
	int maxSpeed = 120;
}

class Car extends Vehicle{
	int maxSpeed = 140;
	
	void display(){
		System.out.println("Maximum Speed: " + super.maxSpeed);
		
	}
}


class SuperWithVariables{
	
	public static void main(String []args){
		
		Car small = new Car();
		
		small.display();
	}
}