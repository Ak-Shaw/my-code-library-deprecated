import java.io.*;
import java.util.Scanner;
public class  ContigiousSequence {
	
	public static  long contigiousSequence(int arr[] , int n) {

		long maxi = Long.MIN_VALUE;
		long sum = 0l;

		for (int i = 0; i < n; i++) {

			sum += arr[i];

			maxi = Math.max(maxi, sum);

			if (sum < 0l) {

				sum = 0l;
			}
		}

		return maxi;
	}
	public static void  main (String args []) {

		Scanner sc =  new  Scanner (System.in);

		int n = sc.nextInt();
		int arr [] = new int[n + 5];
		for ( int i = 0 ; i < n; i++)
			arr[i] = sc.nextInt();

		long max = contigiousSequence(arr, n);
		System.out.println(max);

	}
}

