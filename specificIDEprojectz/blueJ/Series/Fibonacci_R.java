//Fibonacci in reversed order
public class Fibonacci_R
{
public static void main(int n)
{
int a=0,b=1,c,i;
String s="";
for(i=3;i<=n;i++)
{
c=a+b;
s=c+" "+s;
a=b;b=c;
}
System.out.print(s);
System.out.println("1 0");
}
}