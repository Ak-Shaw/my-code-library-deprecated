/*
Problem statement
Since his last hiccup, Wade has now decided to move up 
the ladder and decided to convert a number to its actual 
word form denoting positions using 'thousand', 'million', 
'billion', etc. Again, he is unable to convert a number 
in its word form. Help Wade to convert a number to its 
word form. For example, the word form of 198 would 'one hundred ninety eight'.
Input
A single integer N
Output
Print the word form of the number with all letters in lowercase English alphabets.
Example:
200 : two hundred
4192384: four million one hundred ninety two thousand three hundred eighty four
Constraint
0 ≤ N ≤ 10^10
Sample Input
567434
Sample Output
five hundred sixty seven thousand four hundred thirty four
*/

import java.util.*;

public class word_numbers_ultimate
{
	/*
	this function prints the number
	in the form of words till 3 digits
	e.g., for 123 it will print
	one hundred twenty three
	for 23 it will print twenty three
	*/
	static void hundreds(int n)
	{
		String a[]={"one","two","three","four","five","six","seven","eight","nine"};
		String b[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String c[]={"twen","thir","for","fif","six","seven","eigh","nine"};
		if(n/100!=0)
			System.out.print(a[n/100-1]+" hundred ");
		n%=100;
		if(n>0&&n<10)
			System.out.print(a[n-1]+" ");
		else if(n>9&&n<20)
			System.out.print(b[n-10]+" ");
		else
		{
			if(n>19)
			System.out.print(c[n/10-2]+"ty ");
			if(n%10!=0)
				System.out.print(a[n%10-1]+" ");
		}
	}

	public static void main(String[] args) {
		String a[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		String s=Long.toString(n),q;
		int m;

		//applying constraint
		if(n<0||n>(long)Math.pow(10,10))
		{
			System.out.print("0 ≤ N ≤ 10^10");
			System.exit(0);
		}

		if(n==0)
		{
			System.out.print("zero ");
			System.exit(0);
		}

		//printing billions portion(if any)
		if(s.length()>9)
		{
			if(s.length()==10)
				q=s.substring(0,1);
			else
				q=s.substring(0,2);
			m=Integer.parseInt(q);
			System.out.print(a[m-1]+" billion ");
			if(s.length()==10)
				s=s.substring(1);
			else
				s=s.substring(2);
		}

		//the below two conditions stores the 
		//number in the form of 9 digits if
		//found to be 8 or 7 digits long
		if(s.length()==8)
			s="0"+s;
		if(s.length()==7)
			s="00"+s;

		//this condition prints the millions portion
		if(s.length()==9)
		{
			q=s.substring(0,3);
			m=Integer.parseInt(q);
			hundreds(m);
			if(m!=0)
				System.out.print("million ");
			s=s.substring(3);
		}

		//the below two conditions stores the 
		//number in the form of 6 digits if
		//found to be 5 or 4 digits long
		if(s.length()==5)
			s="0"+s;
		if(s.length()==4)
			s="00"+s;

		//this condition prints the thousands portiion
		if(s.length()==6)
		{
			q=s.substring(0,3);
			m=Integer.parseInt(q);
			hundreds(m);
			if(m!=0)
				System.out.print("thousand ");
			s=s.substring(3);
		}

		//the below two conditions stores the 
		//number in the form of 3 digits if
		//found to be 2 or 1 digit long
		if(s.length()==2)
			s="0"+s;
		if(s.length()==1)
			s="00"+s;

		//this condition prints the last hundreds portion
		if(s.length()==3)
		{
			m=Integer.parseInt(s);
			hundreds(m);
		}
	}
}