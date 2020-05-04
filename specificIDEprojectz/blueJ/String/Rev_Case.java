/*
WAP to input a string and print out the text with the uppercase and 
lowercase letters reversed, but all other characters should remain the 
same as before.   
Example :
INPUT  :           WelComE TO School
OUTPUT :           wELcOMe to sCHOOL
                                                     [ICSE 2008]
*/
import java.io.*;
public class Rev_Case
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
String b="";
System.out.print("Enter a string :");
String a=br.readLine();
int l=a.length();
for(int i=0;i<l;i++)
{
ch=a.charAt(i);
if(ch>='A'&&ch<='Z')
b=b+Character.toLowerCase(ch);
else if(ch>='a'&&ch<='z')
b=b+Character.toUpperCase(ch);
else
b=b+ch;
}
System.out.println("New String :"+b);
}
}