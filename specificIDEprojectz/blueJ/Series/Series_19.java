// s = 5 + 8 + 11 + 14 + 17 +.......+N
public class Series_19
{
public static void main(int N)
{
int i,s=0,b;
for(i=1;i<=N;i++)
{
b=3*i+2;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 