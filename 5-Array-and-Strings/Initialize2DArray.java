import java.util.Scanner;

class Initialize2DArray{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			
	}
}
		
	