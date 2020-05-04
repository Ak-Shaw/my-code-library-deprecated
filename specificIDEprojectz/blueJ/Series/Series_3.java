//Sum = 0 + 1 + 2 + 3 + 4........+n
public class Series_3
{
public static void main(int n)
{
int i,b,s=0;
for(i=1;i<=n;i++)
{
b=i-1;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 