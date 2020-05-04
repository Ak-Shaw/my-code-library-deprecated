// s = a + a^2 + a^3 +........+ a^10
public class Series_34
{
public static void main(int a)
{
int i;
double b,s=0;
for(i=1;i<=10;i++)
{
b=Math.pow(a,i);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 