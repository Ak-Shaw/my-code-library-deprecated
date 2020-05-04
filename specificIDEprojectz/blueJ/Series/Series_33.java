// s = 1 + 1/2 + 1/3 + 1/4 +........+ N terms
public class Series_33
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=1/i;
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+(int)s);
}
} 