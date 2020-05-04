// Java program to demonstrate StringBuffer insert 
// for boolean input. 
import java.lang.*; 

public class GFG { 
	public static void main(String[] args) 
	{ 
		StringBuffer str = 
			new StringBuffer("geeks for geeks"); 
		System.out.println("string = " + str); 

		// insert boolean value at offset 8 
		str.insert(8, true); 

		// prints stringbuffer after insertion 
		System.out.print("After insertion = "); 
		System.out.println(str.toString()); 
	} 
} 
