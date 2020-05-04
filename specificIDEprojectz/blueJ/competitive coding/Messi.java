/*
Messi has N friends. They are invited to his birthday party. Each
friend has a satisfying factor which is equal to the number of
gifts which they are expecting. Messi wants to satisfy at-least
K friends but he is unaware of their satisfying factors. So Messi
starts distribution of gifts. As soon as a friend id satisfied 
he won't take more gifts.

Messi will follow a distribution strategy so as to minimize the 
number of gifts needed to satisfy atleast K of his friends. Find 
the minimum number of gifts which Messi should carry with himself in 
the worst case.

Input Format

First line contains an integer T(the number of testcases).

Then first line of each test case contains an integer N(the number of friends).

Then N spaced separated integers follow which are the satisfying factor(s).

Last line of each test case consists of an integer K.

Constraints

1<=T<=10

1<=N,S[l]<=10^5

1<=K<=N

*/

import java.util.*;

public class Messi
{

	//implementing bubble sort
	static void sort(int a[])
	{
		int i,j,n=a.length;

		for(i=0;i<n-1;i++)
			for(j=0;j<n-1-i;j++)
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
	}

	//calculating sum of first n elements
	static int sumK(int a[],int n)
	{
		int s=0,i;

		for(s=0,i=0;i<n;s+=a[i],i++);

		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		//applying constraint
		if(T<1||T>10)
		{
			System.out.println("1<=T<=10");
			System.exit(0);
		}

		int tc[]=new int[T];
		int i=0;

		while(i<T)
		{
			sc.nextLine();
			int N=sc.nextInt();

			//applying constraint
			if(N<1||N>100000)
			{
				System.out.println("1<=N<=10^5");
				System.exit(0);
			}

			sc.nextLine();
			int S[]=new int[N];
			
			for(int j=0;j<N;S[j]=sc.nextInt(),j++);

			//applying constraint
			for(int j=0;j<N;j++)
				if(S[j]<1||S[j]>100000)
				{
					System.out.println("1<=S[l]<=10^5");
					System.exit(0);
				}

			sc.nextLine();
			int K=sc.nextInt();

			//applying constraint
			if(K<1||K>N)
			{
				System.out.println("1<=K<=N");
				System.exit(0);
			}

			//sorting array in ascending order
			sort(S);

			//storing the min no. of presents for each test case
			tc[i++]=sumK(S,K);
		}

		for(int q=0;q<T;System.out.println(tc[q]),q++);
	}
}