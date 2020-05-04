/*
Problem statement
Molly has a habit of shifting. She shifts letters of a string certain 
number of times. She takes any string and shifts back each letter of 
the string alphabetically. For example, if she shifts letters of string 
'dcoder' 1 time, it becomes 'cbncdq',i.e, all letters of the string 
are shifted back by one. In case of presence of 'a', it is shifted 
back in a circular manner to 'z'. You will be given a string, print 
the changed string after Molly's shifting.
Input
A single string and a single positive integer D in the next line. D denotes the number of times we have to shift back.
Output
Print the converted string after Molly's Shifting.
Constraint
1 ≤ string.length ≤ 50
1 ≤ D ≤ 100
All characters of the string will be in lowercase.
Sample Input
bcde
Sample Output
abcd
*/

import java.util.*;

public class need_for_shift
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()>50)
		{
			System.out.print("1 ≤ string.length ≤ 50");
			System.exit(0);
		}
		char c[]=new char[s.length()];
		int flag=1;
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			if(c[i]>64&&c[i]<91)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("All characters should be in lowercase");
			System.exit(0);
		}
		sc.nextLine();
		int d=sc.nextInt();
		if(d<1||d>100)
		{
			System.out.print("1 ≤ D ≤ 100");
			System.exit(0);
		}
		d%=26;
		for(int i=0;i<s.length();i++)
		{
			c[i]-=d;
			if(c[i]<97)
				c[i]+=26;
			System.out.print(c[i]);
		}
	}
}