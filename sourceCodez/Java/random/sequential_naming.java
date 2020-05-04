/*
Problem statement
You are developing a File Manager but encountered a problem. You realised that two files cannot have the same names and if a conflict arises, the file which came later has to be appended with a number N, such that N is the smallest positive number that is not used with that particular file name. The number is append in the form of file_name(N). Write a code to solve your problem.
You will be given an array of strings of file names. You need to assume that if a file name appears earlier in an array, it was created first.
NOTE : file_name and file_name(2) are two different file names, i.e, if a file name already has a number appended to it, its a different file name
Input
The first line contains N, the number of strings.
The next line contains N, space-separated strings(file names).
Output
Print the names of files, after making the necessary changes, separated by space.
Constraint
1 ≤ N ≤ 50
1 ≤ file_name.length ≤ 25
file_name has no whitespace characters
Sample Input
7
file sample sample file file file(1) file(1)
Sample Output
file sample sample(1) file(1) file(2) file(1)(1) file(1)(2)
*/

import java.util.*;

public class sequential_naming
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
			a[i]=sc.next();
		for(int i=0;i<n-1;i++)
		{
			int c=1;
			for(int j=i+1;j<n;j++)
				if(a[i].equalsIgnoreCase(a[j]))
					a[j]+="("+c+++")";
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}