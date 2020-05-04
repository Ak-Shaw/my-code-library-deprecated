// 1 23 456 78910 1112131415 ...to n terms
public class Series_67
{
public static void main(int n)
{
String s="";
int i,j,t=0,a=1;
for(i=0;i<=n;i++)
{
t=0;
s="";
for(j=1;j<=i;j++)
{
t+=a;
s+=a++;
}
System.out.print(s+" ");
}
System.out.println("\nSum of elements of last term ="+t);
t=0;
for(i=0;i<s.length();i++)
t+=(int)(s.charAt(i))-48;
System.out.println("Sum of digits of last term ="+t);
}
}