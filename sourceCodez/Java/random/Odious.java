// Java program to check if a number is 
// Odious Number or not 
import java.util.*; 
import java.math.*; 

class Odious { 
	
	/* Function to get no of set bits in binary 
	representation of passed binary no. 
	Please refer below for details of this 
	function : 
	https://www.geeksforgeeks.org/count-set-bits-in-an-integer/ */
	static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n!=0) 
		{ 
		n &= (n-1) ; 
		count++; 
		} 
		return count; 
	} 
	
	// Check if number is odious or not 
	static boolean checkOdious(int n) 
	{ 
		return (countSetBits(n) % 2 == 1); 
	} 
	
	// Driver Code 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);

		System.out.print("number : ");
		int num = sc.nextInt(); 
		if (checkOdious(num)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

/*This code is contributed by Nikita Tiwari.*/
