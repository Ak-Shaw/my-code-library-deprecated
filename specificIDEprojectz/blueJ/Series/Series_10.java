// s = 0 + 2 + 6 + 12 + 20 + 30 +.......+N
public class Series_10
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=i*(i-1);
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 