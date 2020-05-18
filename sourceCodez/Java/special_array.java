/*
Problem statement
Natural numbers are the set of positive integers, which ranges from 1 to 
infinity excluding fractional part. Natural numbers are whole numbers 
excluding zero. Zero is the only whole number which is not a natural 
number. An array is special if all the elements are natural numbers. 
Find whether the given array is special or not.
Input
The first line of input contains a single integer N denoting the array size.
The second line of input contains N-space separated integers denoting the array.
Output
Print "Yes" if the array is special else print "No".
Constraint
1<=N<=100.
0<=Arrays elements<=100.
Sample Input
4
0 1 2 3
Sample Output
No
*/

import java.util.*;

public class special_array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		//applying constraint
		if(n<1||n>100)
		{
			System.out.println("1<=N<=100");
			System.exit(0);
		}

		sc.nextLine();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int flag=1;

		//applying constraint
		for(int i=0;i<n;i++)
			if(a[i]<0||a[i]>100)
			{
				flag=0;
				break;
			}
		if(flag==0)
		{
			System.out.println("0<=Arrays elements<=100");
			System.exit(0);
		}

		//verifying special array and setting flag to 0 if not
		for(int i=0;i<n;i++)
			if(a[i]<1)
			{
				flag=0;
				break;
			}
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}