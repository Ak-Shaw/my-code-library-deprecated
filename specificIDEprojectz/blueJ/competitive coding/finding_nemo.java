/*
Problem statement
Nemo is a little kid in Word-World who always gets mixed in a group of other words and gets lost. Marlin and Coral (Nemo's parents) are quite desperate and called you for help every time Nemo got lost. You helped for the first few times but got irritated when you were called upon again and again. So write an algorithm that would do your work for you. You will be given a group of words. You need to find 'Nemo' among these words and print its position.
Input
First line contains N, the number of words.
The next line contains N space-separated words.
Output
Print the position of the word 'Nemo' in the group.
Constraint
1 ≤ N ≤ 1000
1 ≤ word.length ≤ 50
Sample Input
6
This is a Nemo sample input
Sample Output
4
*/

import java.util.*;

public class finding_nemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1||n>1000)
		{
			System.out.println("1 ≤ N ≤ 1000");
			System.exit(0);
		}
		sc.nextLine();
		String s[]=sc.nextLine().split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>50)
			{
				System.out.println("1 ≤ word.length ≤ 50");
				System.exit(0);
			}
		}
		int pos=1;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].compareTo("Nemo")==0)
				break;
			pos++;
		}
		if(pos>s.length)
			pos=0;
		System.out.print(pos);
	}
}