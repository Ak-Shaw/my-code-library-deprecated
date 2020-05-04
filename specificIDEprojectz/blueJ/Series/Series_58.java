// s = 1 4 9 7 7 9 13 10 9 14........ N terms
import java.io.*;
public class Series_58
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,N,a,b,c,s=0;
System.out.print("Enter the Limit :");
N=Integer.parseInt(br.readLine());
for(i=1;i<=N;i++)
{
b=i*i;
if(b<=9)
System.out.print(b+" ");
else
{
s=0;
while(b!=0)
{
c=b%10;
s=s+c;
b=b/10;
}
System.out.println(s+" ");
}
} 
}
}