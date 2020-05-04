// s = 0 + 3 + 8 + 15 + 24 + 35 +........+ N terms
import java.io.*;
public class Series_54
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N;
double b,s=0;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=Math.pow(i,2)-1;
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 