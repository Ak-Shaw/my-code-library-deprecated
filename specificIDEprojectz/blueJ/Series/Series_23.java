// s = -1 + 2 + -3 + 4 + -5 +.......+N
public class Series_23
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=i*Math.pow((-1),i);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 