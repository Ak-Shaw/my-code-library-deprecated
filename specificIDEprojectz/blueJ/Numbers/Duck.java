/*
 * Accept a number and check whether it is a duck number or not.
 * 
 *        A number is said to be a duck number if it contains a digit of 0(ZERO)
 */
public class Duck
{
public static void main(int n)
{
int a,r=0,f=0;
a=n;
while(a!=0)
{
r=a%10;
if(r==0)
f=1;
a=a/10;
}
if(f==1)
System.out.println(n+" is a Duck number");
else
System.out.println(n+" is not a Duck number");
}
}