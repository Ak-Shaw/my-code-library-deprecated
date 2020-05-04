/*
 * Accept a Binary number and display its decimal equivalent
 */
import java.io.*;
public class Bin_Dec
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m,p=0,d;
double sum=0;
System.out.print("Binary number :");
m=Integer.parseInt(in.readLine());
while(m!=0)
{
d=m%10;;
if(d==1)
sum=sum+Math.pow(2,p);
m/=10;
p++;
}
System.out.println("Decimal Equivalent :"+(int)sum);
}
}
/**
 * ALTERNATIVE METHOD
 * 
import java.io.*;
public class b
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int m,p=0,d;
double sum=0;
System.out.print("Binary number :");
m=Integer.parseInt(in.readLine());
while(m!=0)
{
d=m%10;;
sum=sum+d*Math.pow(2,p++);
m/=10;
}
System.out.println("Decimal Equivalent :"+(int)sum);
}
}
 */