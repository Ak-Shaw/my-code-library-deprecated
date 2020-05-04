// s = 4 + 7 + 10 + 13 + 16 +.......+N
public class Series_17
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=3*i+1;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 