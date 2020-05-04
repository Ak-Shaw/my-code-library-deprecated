// s = 3 + 5 + 7 + 9 + 11 + 13 +.......+N
public class Series_13
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=2*i+1;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 