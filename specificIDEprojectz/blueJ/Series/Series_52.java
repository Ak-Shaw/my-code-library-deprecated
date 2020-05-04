// s = 1/0! + 1/1! + 1/2! + 1/3! + 1/4! +........+ N terms
import java.io.*;
public class Series_52
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N;
double b,s=0,f=1;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=1/f;
System.out.print((int)b+" ");
s=s+b;
f*=i;
}
System.out.println("\nSum ="+(int)s);
}
} 