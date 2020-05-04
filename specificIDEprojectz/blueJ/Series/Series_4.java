//Sum = 3 + 4 + 5 + 6........+ n
public class Series_4
{
public static void main(int n)
{
int i,b,s=0;
for(i=1;i<=n;i++)
{
b=i+2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
}