/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

class fibo_even_sum{
	public static void main(String[] args) {
		int s=2,a=2,b=3,c=0;
		for(int i=4;c<4000001;c=a+b,a=b,b=c,s+=c%2==0?c:0);
			System.out.print("the sum of the even-valued terms of Fibonacci series till value does not exceed four million:"+s);
	}
}