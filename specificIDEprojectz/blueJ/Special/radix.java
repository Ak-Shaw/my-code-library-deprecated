import java.util.*;
class radix
{
static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("quantity :");
int n=sc.nextInt();
int a[]=new int[n];
int i,t,j,q,c=0,d=0,x,y,e=0;
System.out.println("elements :");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
q=a[i];
while(q!=0)
{
q/=10;
c++;
}
if(c>d)
d=c;
c=0;
}
while(e<d)
{
y=(int)Math.pow(10,e);
x=y*10;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1-i;j++)
{
if(a[j]%x/y>a[j+1]%x/y)
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("\narrangement :"+ ++e);
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}
}