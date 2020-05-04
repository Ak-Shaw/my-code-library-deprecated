/*
Problem statement
A word or a sentence is called a pangram if all the characters of this language appear in it at least once, 
either in lowercase or in uppercase. You are given a string S consisting of lowercase and uppercase 
English letters. If the string is a pangram, print "YES" else print "NO", without the double quotes.
Input
A single string S.
Output
Print "YES", if the string is a pangram, else print "NO".
Constraint
1 ≤ S.length ≤ 100
Sample Input
QuickWaftingZephyrsVexBoldJim
Sample Output
YES
*/

import java.util.*;

public class pangram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();

		//applying constraint
		if(l>100)
		{
			System.out.print("1 ≤ S.length ≤ 100");
			System.exit(0);
		}

		s=s.toUpperCase();
		int flag=1;
		for(int i=65;i<91;i++)
		{
			int f=0;
			for(int j=0;j<l;j++)
			{
				if(s.charAt(j)==i)
					f++;
			}
			if(f<1)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}