/*

Problem Statement
There are N students in a class and Teacher want to divide these students 
into some groups . Teacher told  that groups consisting of two or less 
students not allowed , so Teacher want to have as many groups consisting 
of three or more students as possible. Divide the students so that the 
number of groups consisting of three or more students is maximized.

Input
Single integer N

Output
Maximum number of groups can be formed

Constraints
1<=N<100000

Sample Input
6

Sample Output

2

*/

import java.util.*;

public class ProjectTeams{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		if(n<1||n>99999){
			System.out.println("1<=N<100000");
			System.exit(0);
		}

		System.out.print(n/3);
	}
}