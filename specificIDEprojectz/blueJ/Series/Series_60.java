// s = 1 + 3 + 6 + 10 + 15 + 21 +........+ N terms
import java.io.*;
public class Series_60
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N,ss=0,s=0,j;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
s=0;
for(j=1;j<=i;j++)
s=s+j;
System.out.print(s+" ");
ss+=s;
}
System.out.println("\nSum ="+ss);
}
} 