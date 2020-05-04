import java.util.*;
public class Palindrome_3
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a string :");
String s=sc.nextLine();
int l=s.length(),k=0,i,t=l-1,n=l/2;
char a[]=s.toCharArray();
for(i=0;i<n;k=a[i]!=a[t-i]?1:0,i+=k==1?n:1);
if(k==0)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}

/**
 * Best case scenario for this code is a non-palindrome string having different characters at first and last indices
 */