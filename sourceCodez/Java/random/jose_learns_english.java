/*
Problem statement
José is from South America and hence, Spanish is his mother tongue. 
He wants to travel around the world and, therefore, decides to learn 
various languages, starting with English. He tries to learn the 
alphabetical order.. You being a good teacher will help him in 
doing so. He said he would learn just by asking questions. You 
have to answer his questions. You will be given few characters. 
You need to arrange them in alphabetical order and print them.
NOTE: Do not mind the case. (example : 'D' will come after 'a' in alphabetical order)
Input
First line of input is N, the number of characters.
Next line contains N space-separated characters.
Output
Print the characters in ascending form
Constraint
1 ≤ N ≤ 26
It is guaranteed that no character will be repeated.
Sample Input
4
D c a M
Sample Output
a c D M
*/

import java.util.*;

public class jose_learns_english
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		char c[],t;
		c=new char[n];
		int b[]=new int[n],f;

		/*
		the character array c[] stores the alphabets
		entered and the integer array b[] stores
		their respective positional values
		i.e. 1 for 'a' or 'A', 2 for 'b' or 'B'
		and so on
		*/
		for(int i=0;i<n;i++)
		{
			c[i]=sc.next().charAt(0);
			if(c[i]>64&&c[i]<91)
				b[i]=(int)c[i]-64;
			if(c[i]>96&&c[i]<123)
				b[i]=(int)c[i]-96;
		}

		/*
		applying bubble sort to the
		array b[] and also swapping the
		characters of c[] at respective
		positions
		*/
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1-i;j++)
				if(b[j]>b[j+1])
				{
					f=b[j];
					b[j]=b[j+1];
					b[j+1]=f;
					t=c[j];
					c[j]=c[j+1];
					c[j+1]=t;
				}
				
		for(int i=0;i<n;i++)
			System.out.print(c[i]+" ");
	}
}