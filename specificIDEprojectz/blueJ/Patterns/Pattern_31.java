/**
 * 
 * * * * * * * *
 * * * *   * * *
 * * *       * *
 * *           *
 * * *       * *
 * * * *   * * *
 * * * * * * * *
 * 
 */
public class Pattern_31
{
public static void main(String args[])
{
int i,j,k,l=2,s=4;
for(i=1;i<=4;i++)
System.out.print("* ");//System.out.print(i+" ");
for(j=4-1;j>=1;j--)
System.out.print("* ");// System.out.print(j+" ");
System.out.println();
for(i=1;i<=4-1;i++)
{
s--;
for(j=1;j<=s;j++)
System.out.print("* ");// System.out.print(j+" ");
for(k=1;k<=l;k++)
System.out.print(" ");
for(j=s;j>=1;j--)
System.out.print("* ");// System.out.print(j+" ");
System.out.println();
l+=4;
}
l=6;
for(i=1;i<4;i++)
{
for(j=0;j<=i;j++)
System.out.print("* ");//System.out.print((j+1)+" ");
for(j=0;j<l;j++)
System.out.print(" ");
for(j=i+1;j>=1;j--)
{
if(j!=4)
System.out.print("* ");//System.out.print(j+" ");
}
l-=4;
System.out.println();
}
}
}