/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/



class sum_mul_3_5
{
	public static void main(String[] args) {
	    int s=0;
		for (int i=3;i<1000 ; s+=i%3==0||i%5==0?i:0,i++);
		System.out.println("the sum of all the multiples of 3 or 5 below 1000 ="+s);		}
	}
