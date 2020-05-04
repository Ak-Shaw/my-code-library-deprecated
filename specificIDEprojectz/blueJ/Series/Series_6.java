//Sum = 1 + 4 + 9 + 16......+ n
public class Series_6
{
public static void main(int n)
{
int i,b,s=0;
for(i=1;i<=n;i++)
{
b=i*i;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
}