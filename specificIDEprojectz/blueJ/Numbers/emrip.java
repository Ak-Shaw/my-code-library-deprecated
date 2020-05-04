public class emrip
{
public static void main(int n)
{
int i,f=0,f1=0,n1,d,r=0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
f=1;
break;
}
}
while(n!=0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
for(i=2;i<r;i++)
{
if(r%i==0)
{
f1=1;
break;
}
}
if(f==0&&f1==0)
System.out.println("emrip");
else
System.out.println("not emrip");
}
}