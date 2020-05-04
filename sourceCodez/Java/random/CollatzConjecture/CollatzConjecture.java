/*

Collatz Conjecture

The Collatz Conjecture (also known as  the Ulam conjecture or the Syracuse 
problem) is an unsolved mathematical problem, which is very easy to
formulate:

1. Take any natural number
2. If it's even, half it, otherwise triple it and add one
3. Repeat step 2 until you reach 4, 2, 1 sequence
4. You will ALWAYS reach 1 eventually.

Example:

x=17

17 * 3 + 1 = 52
52 / 2 = 26
26 / 2 = 13
13 * 3 + 1 = 40
40 / 2 = 20
20 / 2 = 10
10 / 2 = 5
5 * 3 + 1 = 16
16 / 2 = 8
8 / 2 = 4
4 / 2 = 2
2 / 2 = 1
1 * 3 + 1 = 4
...

That last sequence: 4, 2, 1 is an infinitely repeating loop. The formulated
conjecture is that for any x the sequence will always reach 4, 2, 1 ultimately.

The sequence of numbers thus formed are known as hailstone numbers
or the hailstone sequence

While the problem cannot be proved, the assignment is to write a code that will
produce and print out the whole sequence for an input number.

Both recursive and iterative approaches count. Bonus points for printing out how 
many iterations it took for x to converge to 1.

Sample Input:

17

Sample Output:

x = 17

sequence :

17 * 3 + 1 = 52
52 / 2 = 26
26 / 2 = 13
13 * 3 + 1 = 40
40 / 2 = 20
20 / 2 = 10
10 / 2 = 5
5 * 3 + 1 = 16
16 / 2 = 8
8 / 2 = 4
4 / 2 = 2
2 / 2 = 1
...

it took 12 iterations for x to converge to 1


*/

import java.util.*;

public class CollatzConjecture{

	private static int x;
	private static int c=0;

	CollatzConjecture(int x){
		this.x=x;
	}

	static void sequence(){

		if(x==1){
			System.out.println("...");
			return;
		}

		System.out.print(x);

		if(x%2==0){
			x/=2;
			System.out.println(" / 2 = "+x);
		} else {
			x=x*3+1;
			System.out.println(" * 3 + 1 = "+x);
		}
		
		c++;

		sequence();
	}

	int getC(){
		return c;
	}
}

class Main{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("x = ");

		CollatzConjecture ob=new CollatzConjecture(sc.nextInt());

		System.out.println("\nsequence :\n");

		ob.sequence();

		System.out.println("\nit took "+ob.getC()+" iterations for x to converge to 1");
	}
}