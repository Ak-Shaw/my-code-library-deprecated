/*
Problem statement
You will be given a single string and two positive integers denoting indices. You need to change the case of the characters at those indices,i.e change uppercase to lowercase and lowercase to uppercase. It is guaranteed that all characters in the string are alphabets.
Input
The first line contains N, the length of string.
The next line contains a single string.
Two integers, x and y, in next line separated by space.
Output
Print the string after altering the case of characters at those indices
Constraint
1 ≤ string.length ≤ 40
0 ≤ x,y < string.length
Sample Input
6
Dcoder
0 3
Sample Output
dcoDer
*/

import java.util.*;

public class change_in_case
{
	//changes case of character
	static char changeCase(char c)
	{
		if(c>64&&c<91)
			c+=32;
		else if(c>96&&c<123)
			c-=32;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		//applying constraint
		if(n<1||n>40)
		{
			System.out.println("1 ≤ string.length ≤ 40");
			System.exit(0);
		}
		sc.nextLine();
		String s=sc.nextLine();

		//applying constraint
		if(s.length()!=n)
		{
			System.out.println("length of string should be :"+n);
			System.exit(0);
		}
		int x=sc.nextInt();

		//applying constraintv
		if(x<0||x>n-1)
		{
			System.out.println("0 ≤ x,y < string.length");
			System.exit(0);
		}
		
		int y=sc.nextInt();

		//applying constraint
		if(y<0||y>n-1)
		{
			System.out.println("0 ≤ x,y < string.length");
			System.exit(0);
		}
		char c=changeCase(s.charAt(x));

		//replacing character at index x with c
		s=s.substring(0,x)+c+s.substring(x+1);
		c=changeCase(s.charAt(y));

		//replacing character at index y with c
		s=s.substring(0,y)+c+s.substring(y+1);
		System.out.println(s);
	}
}