/**
n=3;
    * * *       * * * 
  *       *   *       * 
*           *           * 
  *                   *
    *               *
      *           *
        *       *
          *   *
            * 

*/
public class Pattern_41
{
public static void main(int n)
{
int i,j,s1=2*n-2,s2=s1+2,l=3*(n-1),s3=2*(2*n-3),s4;
for(i=1;i<=n;i++)
{
for(j=0;j<s1;j++)
System.out.print(" ");
System.out.print("* ");
if(i==1)
{
for(j=0;j<n-2;j++)
System.out.print("* ");
}
else
{
for(j=0;j<s2;j++)
System.out.print(" ");
}
System.out.print("* ");
for(j=0;j<s3;j++)
System.out.print(" ");
if(i!=n)
System.out.print("* ");
if(i==1)
{
for(j=0;j<n-2;j++)
System.out.print("* ");
}
else
{
for(j=0;j<s2;j++)
System.out.print(" ");
}
System.out.println("* ");
s1-=2;
if(i>1)
s2+=4;
s3-=4;
}
s4=2*(s2-5);
s1=2;
for(i=1;i<=l;i++)
{
for(j=0;j<s1;j++)
System.out.print(" ");
System.out.print("* ");
for(j=0;j<s4;j++)
System.out.print(" ");
if(i!=l)
System.out.print("*");
System.out.println();
s1+=2;
s4-=4;
}
}
}