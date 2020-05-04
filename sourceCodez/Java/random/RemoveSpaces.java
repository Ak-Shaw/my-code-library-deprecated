/*

Remove Spaces from a String

Given a string as input, output it without spaces.

For example:

string = "ab c d e fgh i j kl mn opqr stuvwxyz"
result = "abcdefghijklmnopqrstuvwxyz"

*/

import java.util.*;

public class RemoveSpaces{

	private String s;

	RemoveSpaces(String s){

		this.s=s;
	}

	String remSpc(){

		String remSpc="";

		for(char c : s.toCharArray())
			if(c!=' ')
				remSpc+=c;

		return remSpc;
	}
}

class Main{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("string = ");
		
		RemoveSpaces ob=new RemoveSpaces(sc.nextLine());

		System.out.println("result = "+ob.remSpc());
	}
}