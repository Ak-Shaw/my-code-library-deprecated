/*
 * Accept a decimal number and display its equivalent binary number
 */
import java.io.*;
public class Dec_Bin
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,r,q=0;
String s="";
System.out.print("Decimal Number :");
n=Integer.parseInt(in.readLine());
while(n!=0)
{
r=n%2;
n/=2;
s=r+s;
}
System.out.println("Binary Equivalent :"+s);
}
}