// Keith Number
import java.util.*;
public class Keith
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Number :");
int n=sc.nextInt();
int c=n,m=n,d=0,s=0,a[]=new int[n],i=0;
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
System.out.println("Keith Number");
else
System.out.println("Not a Keith Number");
}
}