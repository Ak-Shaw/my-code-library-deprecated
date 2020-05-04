// s = y(x-3) + y(x-7) + y(x-11) + y(x-14)+........+ N terms
import java.io.*;
public class Series_53
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
b=y*(x-(i*4-1));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 