/*

input : 78

78+87=165
165+561=726
726+627=1353
1353+3531=4884

[note: this program sets a limit on the no. of steps to be 15]
*/

import java.util.*;

public class PalindromeGeneration{

	static int reverse(int n){

		int s=0;
		while(n>0){
			s=s*10+n%10;
			n/=10;
		}

		return s;
	}

	static boolean palindrome(int n){

		if(n==reverse(n)){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("number : ");
		int n=sc.nextInt();

		int i=1;

		while(i<16){
			
			n=n+reverse(n);
			
			if(palindrome(n))
				break;

			i++;
		}

		if(i<16)
			System.out.println("palindrome generated : "+n);
		else
			System.out.println("step limit exceeded");

	}
}