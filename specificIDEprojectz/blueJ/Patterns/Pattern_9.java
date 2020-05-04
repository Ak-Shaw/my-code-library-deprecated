/**
 *  41
 *  31 32
 *  21 22 23
 *  11 12 13 14
 */
public class Pattern_9
{
public static void main(String args[])
{
int i,j,a=40;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+(a+j));
}
a=a-10;
System.out.println();
}
}
}