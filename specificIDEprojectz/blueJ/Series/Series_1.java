//Sum = 1 + 2 + 3 + 4 + 5......+n
public class Series_1
{
public static void main(int n)
{
int i,b,s=0;
for(i=1;i<=n;i++)
{
b=i;
s=s+b;
System.out.print(" "+b);
}
System.out.println("\nSum ="+s);
}
}