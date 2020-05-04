/*
Problem statement
Archie was given a homework by his teacher. He is given a fraction and he needs to write it in its reduced form. Archie is not good at Maths. Help Archie finish his homework.
Input
2 integers separated by space denoting the numerator and denominator respectively.
Output
Print the reduced form of the fraction
Constraint
1 ≤ N ≤ D ≤ 1000
Sample Input
20 40
Sample Output
1 2
*/

import java.util.*;

public class Archie_and_his_Homework
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();

		//applying constraints
		if(n<1||n>d)
		{
			System.out.println("1 ≤ N ≤ D ≤ 1000");
			System.exit(0);
		}
		if(d<n||d>1000)
		{
			System.out.println("1 ≤ N ≤ D ≤ 1000");
			System.exit(0);
		}

		int c,a,b;
		a=n;b=d;

		do
		{
			c=b%a;
			b=a;
			a=c;
		}while(c!=0);

		n/=b;
		d/=b;
		System.out.print(n+" "+d);
	}
}