/*

Problem Statement
All numbers in NumberLand are standing in a circle for a dancing 
ceremony. Every number needs a dancing partner. Dancing partner 
of any number is the number which is standing radially opposite 
to it in the circle. The numbers are from 0 to N-1. A certain 
number X wants to know who will be its dancing partner. Please help X.

Input
Two positive integers denoting the value of N and X.

Output
Print the number radially opposite to X in a circle of N numbers.

Constraints
4 ≤ N ≤ 20 0 ≤ X < N

Sample Input
8 2

Sample Output

6

*/

import java.util.*;

public class CircleOfNumbers{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int x=sc.nextInt();

		if(x<n/2)
			System.out.print(x+n/2);
		else
			System.out.print(x-n/2);
	}
}