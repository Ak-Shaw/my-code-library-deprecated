/*
	You are required to compute the power of a number by implementing a 
	calculator. Create a class MyCalculator which consists of a single 
	method long power(int, int). This method takes two integers, n and p 
	as parameters and finds n^p. If either n or p is negative, then the 
	method must throw an exception which says
	"n or p should not be negative". Also, if both n and p are zero, then the 
	method must throw an exception which says "n and p should not be zero."
	
	For example, -4 and -5 would result in
	java.lang.Exception: n or p should not be negative.
	
 */

package ExceptionEdureka;

import java.util.Scanner;


class MyCalculator {
	
	long power(int a, int b) throws MyException1, MyException2 {
		
		if(a<0||b<0)
			throw new MyException1();
		
		if(a==0&&b==0)
			throw new MyException2();
		
		return (long)Math.pow(a,b);
	}
    
}

class MyException1 extends Exception{
	public String toString() {
		return("java.lang.Exception: n or p should not be negative.");
	}
}

class MyException2 extends Exception{
	public String toString() {
		return("java.lang.Exception: n and p should not be zero.");
	}
}

public class UserDefinedException2 {

	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
