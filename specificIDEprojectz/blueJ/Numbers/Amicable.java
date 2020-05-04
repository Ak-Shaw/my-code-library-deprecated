/*
 * Accept two numbers and check whether they are Amicable numbers or not.
 *          Amicable numbers are numbers in which the sum of factors(except 
 * the numbers) of the first number is equal to the second number and the sum 
 * of the factors(except the number) of second number is equal to the first 
 * number.
 * 
 * For example, 220 and 284, 1184 and 1210, 6232 and 6368, etc
 * 
 * 220 -> 1+2+4+5+10+11+20+22+44+55+110 = 284
 * 284 -> 1+2+4+71+142 = 220
 */
public class Amicable
{
public static void main(int a,int b)
{
int i,s1=0,s2=0;
for(i=1;i<=a/2;i++)
{
if(a%i==0)
s1+=i;
}
for(i=1;i<=b/2;i++)
{
if(b%i==0)
s2+=i;
}
if(s1==b&&s2==a)
System.out.println("Amicable numbers");
else
System.out.println("Not Amicable numbers");
}
}