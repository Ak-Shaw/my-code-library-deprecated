// s = 4 + 9 + 16 + 25 + 36 +.......+N
public class Series_25
{
public static void main(int N)
{
int i;
double b,s=0;
for(i=1;i<=N;i++)
{
b=Math.pow((i+1),2);
System.out.print((int)b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 