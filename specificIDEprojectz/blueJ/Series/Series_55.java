// s = x^3/4y^2 * 3x^5/4y^4 * 5x^7/4y^6 *........* N terms
import java.io.*;
public class Series_55
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,x,y,N;
double b,s=1;
System.out.print("Enter the value of x :");
x=Integer.parseInt(br.readLine());
System.out.print("Enter the value of y :");
y=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=Math.pow(((2*i-1)*x),(2*i+1))/(4*Math.pow(y,(i*2)));
System.out.print((int)b+" ");
s=s*b;
}
System.out.println("\nSum ="+(int)s);
}
} 