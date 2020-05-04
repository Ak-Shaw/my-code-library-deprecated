// s = 4 + 6 + 8 + 10 + 12 + 14 + 16 +.......+N
public class Series_15
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=2*i+2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 