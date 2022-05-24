import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderex2{
	public static void main(String... args) throws IOException{
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n);
	}
}
