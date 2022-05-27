
class Student{
	public int roll_no;
	public String name;
	
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}
	

class ArrayOfObjects{
	
	public static void main(String []args){
		
		// declaring an array of integers.
		// allocating memory for 5 objects of type Student.
		Student[] arr = new Student[5];
		
		// initializing the first element of the array
		arr[0] = new Student(1, "Ananth");
		
		// initializing the second elements of the array
		arr[1] = new Student(2, "Akash");
		
		// so on...
		arr[2] = new Student(3,"Abhi");
        arr[3] = new Student(4,"Rashmi");
        arr[4] = new Student(5,"Varun");
		
		// accessing the elements of the specified array
		for(int i=0; i<arr.length; i++){
			System.out.println("element at " + i + ": " + arr[i].roll_no + " "+ arr[i].name);
		}
	}
}
