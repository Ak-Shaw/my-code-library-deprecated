// s = a + a^2/1! +........+ N terms
import java.io.*;
public class Series_38
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,f,a,N;
double b,s=0;
System.out.print("Enter the value of a :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
f=1;
for(j=i-1;j>=1;j--)
f*=j;
b=Math.pow(a,i)/f;
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 