/*
 * GCD(Greatest Common Divisor) of twois calculated by continued division method.
 * Divide the larger number by the smaller; the remainder the divides the 
 * previous divisor. The process is repeated till the remainder is zero. The 
 * divisor then results the GCD.
 *                                                      [ICSE 2009]
 */
import java.util.*;
public class GCD
{
public static void main(String a1[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=1;
System.out.println("Enter two numbers :");
a=sc.nextInt();
b=sc.nextInt();
if(b>a)
{
a+=b;
b=a-b;
a=a-b;
}
while(c!=0)
{
c=a%b;
a=b;
b=c;
}
System.out.println("GCD - Greatest Common Divisor :"+a);
}
}