/*
 * A number is said to be a Vampire number if unique combination of 
 * number segments with the given number and their product results in
 * the number itself. For Example,
 * 
 *                                 126  = 21*6
 *                                 153  = 51*3
 *                                 1530 = 51*30
 */
import java.io.*;
public class Vampire
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a,s,st="";
int len1,len2,b,n,d,e,m,p,i;
char ch;
System.out.print("Enter a number :");
a=br.readLine();
len1=a.length();
b=len1/2;
n=Integer.parseInt(a);
d=(int)(n%Math.pow(10,b));
e=(int)(n/Math.pow(10,b));
s=Integer.toString(e);
len2=s.length();
for(i=len2-1;i>=0;i--)
{
ch=s.charAt(i);
st+=ch;
}
m=Integer.parseInt(st);
p=m*d;
if(p==n)
System.out.println(a+" is a Vampire number");
else
System.out.println(a+" is not a Vampire number");
}
}