/*
Television Sets
=================

Problem Description
---------------------

Dr. Vishnu is opening a new world class hospital in a small town designed to be the first preference of the patients in the city. Hospital has N rooms of two types - with TV and without TV, with daily rates of R1 and R2 respectively. 
However, from his experience Dr. Vishnu knows that the number of patients is not constant throughout the year, instead it follows a pattern. The number of patients on any given day of the year is given by the following formula – 
(6-M)^2 + |D-15| where
M is the number of month (1 for jan, 2 for feb ...12 for dec) and
D is the date (1,2...31).
All patients prefer without TV rooms as they are cheaper, but will opt for with TV rooms only if without TV rooms are not available. Hospital has a revenue target for the first year of operation. Given this target and the values of N, R1 and R2 you need to identify the number of TVs the hospital should buy so that it meets the revenue target. Assume the Hospital opens on 1st Jan and year is a non-leap year. 

Constraints
--------------

Hospital opens on 1st Jan in an ordinary year
5 <= Number of rooms <= 100
500 <= Room Rates <= 5000
0 <= Target revenue < 90000000

Input Format
---------------

First line provides an integer N that denotes the number of rooms in the hospital
Second line provides two space-delimited integers that denote the rates of rooms with TV (R1) and without TV (R2) respectively
Third line provides the revenue target

Output
-------------

Minimum number of TVs the hospital needs to buy to meet its revenue target. If it cannot achieve its target, print the total number of rooms in the hospital.

Test Case
------------

Explanation

Example 1
Input
20
1500 1000
7000000
Output
14 
Explanation
Using the formula, number of patients on 1st Jan will be 39, on 2nd Jan will be 38 and so on. Considering there are only twenty rooms and rates of both type of rooms are 1500 and 1000 respectively, we will need 14 TV sets to get revenue of 7119500. With 13 TV sets Total revenue will be less than 7000000

Example 2
Input
10
1000 1500
10000000
Output
10
Explanation
In the above example, the target will not be achieved, even by equipping all the rooms with TV. Hence, the answer is 10 i.e. total number of rooms in the hospital.

*/
import java.util.*;

public class television_sets
{

	//computes revenue of a given day as per no. of patients(p) admitted
	static int calcRevenue(int x,int y,int r1,int r2,int p){
		int rev;
		if(p>y)
		{
			rev=y*r2;
			p-=y;
		}
		else
		{
			rev=p*r2;
			p=0;
		}
		if(p>x)
		{
			rev+=x*r1;
		}
		else
		{
			rev+=p*r1;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		//applying constraint
		if(n<5||n>100)
		{
			System.out.println("5 <= Number of rooms <= 100");
			System.exit(0);
		}
		sc.nextLine();
		int r1=sc.nextInt();

		//applying constraint
		if(r1<500||r1>5000)
		{
		System.out.println("500 <= Room Rates <= 5000");
		System.exit(0);
		}
		int r2=sc.nextInt();

		//applying constraint
		if(r2<500||r2>5000)
		{
		System.out.println("500 <= Room Rates <= 5000");
		System.exit(0);
		}
		sc.nextLine();
		int rt=sc.nextInt();

		//applying constraint
		if(rt<0||rt>=90000000)
		{
			System.out.println("0 <= Target revenue < 90000000");
			System.exit(0);
		}
		int x=0,rev,p;

		//storing all the days of each respective month
		int md[]={31,28,31,30,31,30,31,31,30,31,30,31};

		/*
		computes minimum no. of tv(s) required(stored in x) for
		target revenue
		*/
		while(x<n)
		{
			rev=0;

			/*
			computing total revenue generated if x rooms
			have tv sets
			*/
			for(int i=0;i<12;i++)
			{
				for(int j=1;j<=md[i];j++)
				{
					p=(int)Math.pow(6-(i+1),2)+(int)Math.abs(j-15);
					rev+=calcRevenue(x,n-x,r1,r2,p);
				}
			}
			if(rev>=rt)break;
			x++;
		}
		System.out.println(x);
	}
}