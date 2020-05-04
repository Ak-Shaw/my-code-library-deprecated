/**
 * 97531
 * 7531
 * 531
 * 31
 * 1
 */
public class Pattern_8
{
public static void main(String args[])
{
int i,j,n=9;
for(i=5;i>=1;i--)
{
for(j=n;j>=1;j=j-2)
{
System.out.print(j);
}
n=n-2;
System.out.println();
}
}
}