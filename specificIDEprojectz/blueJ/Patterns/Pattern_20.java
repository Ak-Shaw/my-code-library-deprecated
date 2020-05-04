/**
 * 1    1
 * 12     3
 * 123     6
 * 1234     10
 * 12345     15
 */
public class Pattern_20
{
public static void main(String args[])
{
int i,j,k,n=5,s;
for(i=1;i<=n;i++)
{
s=0;
for(j=1;j<=i;j++)
{
System.out.print(j);
s+=j;
}
for(k=1;k<=n;k++)
System.out.print(" ");
System.out.println(s);
}
}
}