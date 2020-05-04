// digits in words
import java.util.*;
public class nword
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("number :");
int n=sc.nextInt();
String s="",a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
while(n!=0)
{
int d=n%10;
s=a[d]+" "+s;
n/=10;
}
System.out.println("\n"+s);
}
}