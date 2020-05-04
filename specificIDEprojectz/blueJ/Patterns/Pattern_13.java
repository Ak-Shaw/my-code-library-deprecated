/**
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 */
public class Pattern_13
{
public static void main(String args[])
{
int i,j,a=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)(a+i-1)+" ");
}
System.out.println();
}
}
}