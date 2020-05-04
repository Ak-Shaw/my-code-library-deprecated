/*
New ATM Design
================

Problem Description
--------------------

Automated Teller Machine (ATM) is an electronic device that enables people 
to withdraw cash from their bank account. Every ATM has a limit for number 
of currency notes (say N), it can give at a time.
A bank wants to design an ATM for school students. The unique feature of 
this ATM would be that it would always give maximum number of currency notes 
possible, to make the students happy.  Available denomination of currency notes 
in the ATM are 100, 200, 500, 1000

Constraints
---------------

N<100

Input Format
--------------

First Line provides an integer, N
Second Line provides an integer denoting the amount you want to withdraw (in multiples of 100)
Third Line provides an integer denoting the available currency note of Rs 100 in the ATM
Fourth Line provides an integer denoting the available currency note of Rs 200 in the ATM
Fifth Line provides an integer denoting the available currency note of Rs 500 in the ATM
Sixth Line provides an integer denoting the available currency note of Rs 1000 in the ATM

Output
---------

One line containing the maximum number of currency note possible for the desired withdrawal 
amount. Output should be 0 (zero) if transaction is not possible, for example if sufficient 
fund is not available in the ATM.

Test Case
----------

Explanation
-------------

Example 1
Input
10
1300
10
10 
10
10
Output
10

Explanation
Here,
7 * 100 + 3* 200 + 0*500 +0*1000 hence maximum possible currency = 10. 

Example 2
Input
5
1700
1
2
2
2
Output
3
Explanation
Here,
0 * 100  + 1 * 200 + 1 * 500 +1 * 1000 hence maximum possible currency = 3.
*/

// Source: TCS Codevita 8 (2019) Pre-Qualifier Round

import java.util.*;

public class new_atm_design
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();

		//this if-case applies the given constraint
		if(n>99)
		{
			System.out.println("N should be less than 100");
			System.exit(0);
		}
		
		int a=sc.nextInt();
		sc.nextLine();
		int h1=sc.nextInt();
		sc.nextLine();
		int h2=sc.nextInt();
		sc.nextLine();
		int h5=sc.nextInt();
		sc.nextLine();
		int h10=sc.nextInt();

		int ta=h1*100+h2*200+h5*500+h10*1000;
		// computing total amount available in ATM

		int h10_2=h10;
		int h2_2=h2;

		/* 
		the combination of while loops and if cases 
		below decrease the value of ta(total amount)
		till the required value is reached if possible
		*/
		while(ta>a&&h10!=0)
		{
			ta-=1000;
			h10--;
		}
		if(ta<a)
		{
			ta+=1000;
			h10++;
		}
		while(ta>a&&h5!=0)
		{
			ta-=500;
			h5--;
		}
		if(ta<a)
		{
			ta+=500;
			h5++;
		}
		while(ta>a&&h2!=0)
		{
			ta-=200;
			h2--;
		}
		if(ta<a)
		{
			ta+=200;
			h2++;
		}
		while(ta>a&&h1!=0)
		{
			ta-=100;
			h1--;
		}
		if(ta<a)
		{
			ta+=100;
			h1++;
		}
		
		int tn=h1+h2+h5+h10;
		//computes max no. of notes that form the given amount(a)

		/*
		the if block below decreases the value of tn so that it
		remains in the limit n
		*/
		if(tn>n)
		{
			while(tn>n&&h5>1&&h10<h10_2)
			{
				h5-=2;
				h10+=1;
				tn--;
			}
			while(tn>n&&h1>1&&h2<h2_2)
			{
				h1-=2;
				h2+=1;
				tn--;
			}
		}

		tn=h1+h2+h5+h10;

		/*
		the if case below checks if the amount in ta
		is equal to the required amount a OR the number 
		of notes is within range
		*/
		if(ta!=a||tn>n)
			tn=0;
		System.out.print(tn);
	}
}