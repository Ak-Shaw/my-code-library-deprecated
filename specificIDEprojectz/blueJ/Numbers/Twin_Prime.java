/*
 * Accept any two numbers and check whether the are twin prime or not.
 * 
 * When difference of consecutive prime numbers is 2 then they are twin prime
 * numbers.
 * 
 * Such as, 5 and 7, 11 and 13.
 */
public class Twin_Prime
{
public static void main(int n1,int n2)
{
boolean c1=false,c2=false;
int f=-1;
for(int i=2;i<n1;i++)
{
if(n1%i==0)
{
f=0;
break;
}
}
if(f==-1)
c1=true;
f=-1;
for(int i=2;i<n2;i++)
{
if(n2%i==0)
{
f=0;
break;
}
}
if(f==-1)
c2=true;
if(c1==true&&c2==true&& n2-n1==2)
System.out.println("Twin Prime Numbers");
else
System.out.println("Not Twin Prime Numbers");
}
}