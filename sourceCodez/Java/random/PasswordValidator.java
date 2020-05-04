/*

Password validator is a program that validates passwords to match
specific rules. For example, the minimum length of the password must
be eight characters long and it should have at least one uppercase
letter in it.

A valid password is the one that conforms to the following rules:

- Minimum length is 5;
- Maximum length is 10;
- Should contain at least one number;
- Should contain at least one special character(such as &, +, @, $, #, %, etc.);
- Should not contain spaces.

Examples:

Input: "Sololearn"
Output: false

Input: "John Doe"
Output: false

Input: "$ololearn7"
Output: true

Write a program to check if the user input is a valid password or not.

*/

import java.util.*;

public class PasswordValidator{

	private String s;

	PasswordValidator(String s){

		this.s=s;
	}

	boolean validate(){

		int l=s.length();

		boolean len,num,spchar,nospc=true;

		len=num=spchar=false;

		if(l>4&&l<11)
			len=true;

		for(char c : s.toCharArray()){
       		
       		if(Character.isDigit(c))
       			num=true;

       		if((c>-1&&c<48)||(c>57&&c<65)||(c>90&&c<97)||(c>122&&c<256))
       			spchar=true;

       		if(c==32)
       			nospc=false;
       	}

       	if(len&&num&&spchar&&nospc)
       		return true;
       	return false;

	}
}

class Main{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Input: ");
		String s=sc.nextLine();

		PasswordValidator ob=new PasswordValidator(s);

		System.out.print("Output: ");

		if(ob.validate())
			System.out.print("true");
       	else
       		System.out.print("false");

	}
}