// s = 2 + 4 = 8 + 16 + 32 +.......+N
public class Series_26
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=Math.pow(2,i);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 