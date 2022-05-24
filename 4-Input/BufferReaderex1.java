// Importing required classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderex1{
	public static void main(String... args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string");
		
		String s=br.readLine();
		
		System.out.println("You Entered :" + s);