// s = -1 + 0 + 1 + 2 +3 + 4 + 5 +........+ N terms
import java.io.*;
public class Series_56
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N,b,s=0;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=i-2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 