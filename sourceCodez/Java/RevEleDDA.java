// [Reverse Elements of DDA]

import java.util.*;

public class RevEleDDA{

	static int reverse(int n){

		int rev=0;

		while(n>0){

			rev=rev*10+n%10;
			n/=10;
		}

		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Row order : ");
		int r=sc.nextInt();

		System.out.print("Columb order : ");
		int c=sc.nextInt();

		int[][] a=new int[r][c];

		System.out.println("\n\nenter elements of matrix : \n\n");

		for(int i=0; i<r; i++)
			for(int j=0; j<c; j++)
				a[i][j]=sc.nextInt();

		System.out.println("\n\nmatrix elements : \n\n");

		for(int i=0; i<r; i++){

			for (int j=0; j<c; j++)
				System.out.print("\t"+a[i][j]);

			System.out.println();
		}

		System.out.println("\n\nmatrix elements reversed : \n\n");

		for(int i=0; i<r; i++){

			for (int j=0; j<c; j++)
				System.out.print("\t"+reverse(a[i][j]));

			System.out.println();
		}		
	}
}