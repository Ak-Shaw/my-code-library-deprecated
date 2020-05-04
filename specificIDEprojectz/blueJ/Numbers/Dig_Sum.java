/*
WAP to find the sum of the digits of an integer that is input. 
Eg 15390=18
                                                  [ICSE 2012]
*/
import java.io.*;
public class Dig_Sum
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter an integer :");
int n=Integer.parseInt(br.readLine());
int rem,sum=0;
while(n!=0)
{
rem= n%10;
n/=10;// n=n/10;
sum+=rem;// sum=sum+rem;
}//while ends
System.out.println("Sum of digits :"+sum);
}
}
