import java.io.*;
class CheckedException{
	
	public static void main(String []args) throws IOException{
		
		// Reading file from path in local directory
		FileReader file = new FileReader("C:\\Users\\Unbeknownstguy\\Documents\\GitHub\\Java\\15-Exception-Handling\\Built-in-Exception\\Checked-Exception\\a.txt");
		
		// Creating object as one of ways of taking input
		BufferedReader fileInput = new BufferedReader(file);
		
		for(int counter =0; counter<3; counter++)
			System.out.println(fileInput.readLine());
		
		// Closing file connections
		// using close() method
		fileInput.close();
	}
}
