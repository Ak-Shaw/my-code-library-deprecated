// s = -1 + 2 + 7 + 14 + 23 + 34 +.......+N
public class Series_12
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=i*i-2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 