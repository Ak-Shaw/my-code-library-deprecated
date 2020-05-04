// Tribonacci Series in reversed order
public class Tribonacci_R
{
public static void main(int n)
{
int a=0,b=1,c=2,t,i;
System.out.println("Tribonacci Series in reversed order :");
String s="";
for(i=4;i<=n;i++)
{
t=a+b+c;
s=t+" "+s;
a=b;
b=c;
c=t;
}
System.out.print(s);
System.out.println(" 2 1 0");
}
}