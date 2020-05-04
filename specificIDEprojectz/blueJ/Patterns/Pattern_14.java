/**
 *  A
 *  B C
 *  D E F
 *  G H I J
 *  K L M N O
 */
public class Pattern_14
{
public static void main(String args[])
{
int i,j,a=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+(char)a++);
}
System.out.println();
}
}
}