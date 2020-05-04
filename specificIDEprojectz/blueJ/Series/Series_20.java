// s = 1 + 4 + 7 + 10 + 13 +.......+N
public class Series_20
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=3*i-2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 