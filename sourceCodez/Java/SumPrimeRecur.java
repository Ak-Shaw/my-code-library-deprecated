//sum of prime factors using recursion

import java.util.*;

public class SumPrimeRecur{

	static int i=1;

	static boolean prime(int n){

		for(int i=2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}

		return true;
	}

	static int sumPrime(int n){

		if(i>n/2)
			return 0;
		i++;

		if(n%i==0)
			if(prime(i))
				return i+sumPrime(n);

		return sumPrime(n);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("number : ");
		int n=sc.nextInt();

		System.out.println("sum of prime factors : "+sumPrime(n));
	}
}