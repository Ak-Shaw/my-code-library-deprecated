// s = 1 + 4 + 9 + 61 + 52 + 63 + 94 +........+ N terms
import java.io.*;
public class Series_59
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N,b,c,d,r,s=0;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
r=0;
b=i*i;
// c=b;
while(b!=0)
{
d=b%10;
r=r*10+d;
b=b/10;
}
System.out.print(r+" ");
s=s+r;
}
System.out.println("\nSum ="+s);
}
} 