/*
   WAP using a method Palin(),to check whether a string is
   a Palindrome or not. A Palindrome is a string that reads
   the same from left to right and vice versa.
   
   E.g. MADAM, ARORA, ABBA, etc.
*/
import java.io.*;
public class Palindrome
{
public void Palin()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str, str1="";
int i,len;
char ch;
System.out.print("Enter a Word or Number:");
str=br.readLine();
len=str.length();
for(i=len-1;i>=0;i--)
{
ch=str.charAt(i);
str1=str1+ch;
}
if(str1.equalsIgnoreCase(str))
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
public static void main(String args[])throws IOException
{
Palindrome ob=new Palindrome();
ob.Palin();
}
}
