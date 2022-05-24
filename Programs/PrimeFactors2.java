import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class PrimeFactors2{
	public static void primeFactors(int n){
		
		int c=2;
		while(n>1){
			if(n%c == 0){
				System.out.print(c + " ");
				n /= c;
			}
			else
				c++;
		}
	}
	
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		primeFactors(n);
	}
}
