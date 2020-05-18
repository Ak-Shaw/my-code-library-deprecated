// create upper triangular matrices based on a value 'n'

import java.util.*;

public class UpperTriangularMatrix{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("order : ");
		int n=sc.nextInt();

		int[][] m1=new int[n][n];
		int[][] m2=new int[n][n];

		for(int i=0; i<n; i++){

			for(int j=0; j<n-i; j++){

				m1[i][j]=1;
			}
		}

		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){

				m2[i][j]=1;
			}
		}

		System.out.println("\n\nupper triangular matrix 1 :\n\n");

		for(int i=0; i<n; i++){

			for(int j=0; j<n; j++)
				System.out.print("\t"+m1[i][j]);

			System.out.println();
		}

		System.out.println("\n\nupper triangular matrix 2 :\n\n");

		for(int i=0; i<n; i++){

			for(int j=0; j<n; j++)
				System.out.print("\t"+m2[i][j]);

			System.out.println();
		}
	}
}