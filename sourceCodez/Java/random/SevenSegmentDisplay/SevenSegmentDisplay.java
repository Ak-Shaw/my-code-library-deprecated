/*

Write a program to display any digit(n) from 0-9 using "7 segment  display". 

For example:

input : 5

output :
 _ 
|_ 
 _|

input : 4

output :

|_|
  |

*/

import java.util.*;

public class SevenSegmentDisplay{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("value between 0-9 : ");
		int n=sc.nextInt();

		System.out.print(" ");

		if(n==0||n==2||n==3||n>4)
			System.out.print("_");
		else
			System.out.print(" ");

		System.out.println(" ");

		if(n==0|| (n>3&&n<7) || n>7)
			System.out.print("|");
		else
			System.out.print(" ");

		if(n>1&&n<7 || n>7)
			System.out.print("_");
		else
			System.out.print(" ");

		if(n>-1&&n<5 || n>6)
			System.out.println("|");
		else
			System.out.println(" ");

		if(n==0|| n==2 || n==6|| n==8)
			System.out.print("|");
		else
			System.out.print(" ");

		if(n==0 || n==2 || n==3 || n==5 || n==6 || n==8)
			System.out.print("_");
		else
			System.out.print(" ");

		if(n>-1&&n<2 || n>2)
			System.out.println("|");
		else
			System.out.println(" ");

	}
}

