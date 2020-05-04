// s = 0 + 2 + 4 + 6 + 8 + 10 +.......+N
public class Series_16
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=2*i-2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 