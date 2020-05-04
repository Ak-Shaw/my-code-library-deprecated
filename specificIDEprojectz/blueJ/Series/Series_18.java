// s = 2 + 5 + 8 + 11 + 14 +.......+N
public class Series_18
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=3*i-1;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 