/*
Problem statement
Ron is schizophrenic and sees random digits hidden in words. He thinks it means something 
and someone is trying to secretly communicate with him. He wants to extract those digits 
from the words and see if they form a message. Harry really wants to help him but couldn't 
think of a way. But, Harry finally realized that if he somehow helps Ron in extracting 
those digits, Ron will finally realize that they don't mean anything and are just his 
delusions. He asked Ron to write down all the words that he sees. Help Harry by extracting 
the digits from these words.
Input
First line contains N, the number of words.
Next line contains N space-separated words.
Output
Print the all the extracted digits separated by a space.
Constraint
1 ≤ N ≤ 50
It is guaranteed that at least one digit will be present in the entire input.
Sample Input
3
1 L0v3 Dcoder
Sample Output
1 0 3
*/

import java.util.*;

public class extraction_of_numbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1||n>50)
		{
			System.out.println("1 ≤ N ≤ 50");
			System.exit(0);
		}
		sc.nextLine();
		String s=sc.nextLine();
		String q[]=s.split(" ");
		if(q.length!=n)
		{
			System.out.printf("you need to enter %d words",n);
			System.exit(0);
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>47&&c<58)
				System.out.print(c+" ");
		}
	}
}
