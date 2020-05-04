//Sum (S)  = 2 – 4 + 6 – 8 + ………. -20                [ICSE 2008]
public class Series_61
{
public static void main(String args[])
{
int i;
double b,s=0;
for(i=1;i<=10;i++)
{
b=(i*2)*Math.pow((-1),(i+1));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
}
