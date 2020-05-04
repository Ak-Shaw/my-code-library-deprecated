/**
 * 1    1
 * 12   3
 * 123  6
 * 1234 10
 * 1234515
 */
public class Pattern_19
{
public static void main(String args[])
{
int i,j,n=5,k;
for(i=1;i<=n;i++)
{
int s=0;
for(j=1;j<=i;j++)
{
System.out.print(j);
s+=j;
}
for(k=1;k<=n-i;k++)
System.out.print(" ");
System.out.println(s);
}
}
}