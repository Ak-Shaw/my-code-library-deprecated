/*

Problem Statement
A happy string is a string in which each character is lexicographically 
greater than its next character. You are given a positive integer N as 
an input. You need to print the smallest lexicographical string possible 
of length N. NOTE: All characters in a happy string are in lowercase.

Input
A single integer N.

Output
Print the lexicographically smallest string of length N.

Constraints
1 ≤ N ≤ 26

Sample Input
2

Sample Output

ba

*/

import java.util.*;

public class HappyString{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		String s="";

		for(int i=96+n;i>96;i--)
			s+=(char)i;

		System.out.print(s);
	}
}