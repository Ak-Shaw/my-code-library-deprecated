/*
 * WAP to accept a sentence and count the number of palindrome
 * words located in odd positions
 */
import java.util.*;
public class Palin_Odd
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence :");
String s=sc.nextLine()+" ";
String t="",w="";
int i,j,l=s.length(),k=0,l1=0;
char c;
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c!=' ')
t+=c;
else
{
k++;
for(j=0;j<t.length();j++)
w=t.charAt(j)+w;
if(t.equalsIgnoreCase(w)==true&&k%2!=0&&t.length()!=1)
l1++;
t="";
w="";
}
}
System.out.println("Number of palindrome words located in odd positions :"+l1);
}
}