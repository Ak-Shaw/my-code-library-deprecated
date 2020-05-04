// WAP to generate l Keith Numbers
import java.util.*;
public class Keith_L
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Quantity :");
int l=sc.nextInt();
System.out.println("First "+l+" Keith Numbers :");
int n=14,c,m,d,s,a[]=new int[n*l],i,q=0;
while(q<l)
{
c=n;
m=n;
d=0;
s=0;
i=0;
while(c>0)
{
s+=c%10;
c/=10;
d++;
}
for(c=d-1;c>=0;c--)
{
a[c]=m%10;
m/=10;
}
a[d]=s;
while(s<n)
{
s=2*s-a[i];
a[d+i+1]=s;
i++;
}
if(s==n&&s!=a[0])
{
System.out.println(s);
q++;
}
n++;
}
}
}