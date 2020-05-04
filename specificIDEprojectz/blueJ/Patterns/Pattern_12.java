/**
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */
public class Pattern_12
{
public static void main(String args[])
{
int i,j,a=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)(a+j-1)+" ");
}
System.out.println();
}
}
}