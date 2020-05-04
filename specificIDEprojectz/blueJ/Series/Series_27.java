// s = 4 + 8 + 16 + 32 + 64 +.......+N
public class Series_27
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=Math.pow(2,(i+1));
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 