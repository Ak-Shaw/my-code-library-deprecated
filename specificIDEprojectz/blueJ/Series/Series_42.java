// s = x^2/2y^3 + x^4/2y^5 + x^6/2y^7+........+ N terms
// Alternative Method
import java.io.*;
public class Series_42
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,x,y,N;
double b,s=0;
System.out.print("Enter the value of x :");
x=Integer.parseInt(br.readLine());
System.out.print("Enter the value of y :");
y=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=Math.pow(x,(2*i))/(2*Math.pow(y,2*i+1));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 