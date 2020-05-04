// Encryptology
import java.io.*;
public class Crypto
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the string to be Encrypted :");
String s=br.readLine();
System.out.print("Enter the Encryption Code :");
int m=Integer.parseInt(br.readLine());
int l=s.length();
String str="";
char ch=' ';
int x=0;
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
x=(int)ch;
if(x<=90) //if character is capital letter
{
if(m!=0)
{
x=x+m;
if(x>90)
x=x-26;
if(x<65)
x=x+26;
}
}
else if(x>=97) //if character is small letter
{
if(m!=0)
{
x=x+m;
if(x>122)
x=x-26;
if(x<97)
x=x+26;
}
}
ch=(char)x;
str=str+ch;
}
System.out.println("The encoded string is :"+str);
}
}