/*

WAP which accepts a SDA and then sorts it. After sorting the SDA
has to be displayed in a pattern

for example,

input array : 1 6 4 9 0
sorted array : 0 1 4 6 9

output pattern :

0 1 4 6 9
0 1 4 6 0
0 1 4 0 1
0 1 0 1 4
0 0 1 4 6

*/

import java.util.*;

public class Pattern42{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("limit : ");
		int n=sc.nextInt();

		int a[]=new int[n];

		System.out.println("enter "+n+" integers :\n");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}

		System.out.println("sorted array :\n\n");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]);

		System.out.println("\n\noutput pattern : ");

		for(int i=0;i<n;i++){

			for(int j=0;j<n-i;j++)
				System.out.print(" "+a[j]);

			for(int j=0;j<i;j++)
				System.out.print(" "+a[j]);

			System.out.println();
		}
	}
}