// s = 0 + 1 + 1 + 2 + 3 + 5 + 8 + 18 + 21 +........+ N terms
// Fibonacci Series
import java.io.*;
public class Series_43
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,a=0,b=1,c,next,N,s=0;
c=a+b;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
System.out.print(a+" "+b+" ");
for(i=3;i<=N;i++)
{
next=a+b;
System.out.print(next+" ");
s=s+next;
a=b;
b=next;
}
System.out.println("\nSum ="+(s+c));
}
} 