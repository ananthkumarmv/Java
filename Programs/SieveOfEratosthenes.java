import java.io.*;
import java.util.Scanner;
import java.lang.Math;


class SieveOfEratosthenes {
	void sieveOfEratosthenes(int n){
		
		boolean prime[] = new boolean[n+1];
		
		for(int i=0; i<=n; i++){
			prime[i] = true;
			
		for(int p=2; p * p <= n; p++){
			
			if(prime[p] == true){
			
			for(int j=p*p; j<=n; j+=p)
				prime[j] = false;
			}
			
		}
	}
	
	for(int i=2; i<=n; i++){
		if(prime[i] == true)
			System.out.print(i + " ");
		}
	}
	
	public static void main(String... args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		
		g.sieveOfEratosthenes(n);
	}
}
