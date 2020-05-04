// s = 1! + 2! + 3! +........+ N!
public class Series_32
{
public static void main(int N)
{
int i,j,f;
int b,s=0;
for(i=1;i<=N;i++)
{
f=1;
for(j=1;j<=i;j++)
f*=j;
b=f;
System.out.print(b+" ");
s=s+b;
}
System.out.println("\nSum ="+s);
}
} 