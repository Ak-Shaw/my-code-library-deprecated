// s = -1 + 1 + -1 + 1 + -1 +.......+N
public class Series_21
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=Math.pow((-1),i);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 