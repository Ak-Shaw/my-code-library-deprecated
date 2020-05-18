// fibonacci string

// a b ba bab babba ... n terms

import java.util.*;

public class FibonacciString{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("limit : ");
		int n=sc.nextInt();

		if(n>=1)
			System.out.print("a ");
		if(n>=2)
			System.out.print("b ");

		if(n>=3){

			int i=3;

			String a="a",b="b",c="";

			while(i<=n){

				c=b+a;
				System.out.print(c+" ");
				a=b;
				b=c;

				i++;
			}
		}
	}
}