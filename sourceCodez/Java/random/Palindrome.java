import java.util.*;

public class Palindrome{

	static boolean isPalindrome(String s){

		String rev="";

		for(int i=0;i<s.length();i++){

			char c=s.charAt(i);
			rev=c+rev;
		}

		return s.equals(rev);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("enter a string :");
		String s=sc.nextLine();

		if(isPalindrome(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}