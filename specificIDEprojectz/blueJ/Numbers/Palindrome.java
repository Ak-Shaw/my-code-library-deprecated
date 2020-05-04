/*
A number is a Palindrome which when read in reverse order is same as 
read in the right order
Example : 11, 101, 151 etc.
                                                        [ICSE 2008]
*/
public class Palindrome
{
public static void main(int n)
{
int b,d,r=0;
b=n;
while(b!=0)
{
d=b%10;
r=r*10+d;
b=b/10;
}
if(r==n)
System.out.println(n+" is a Palindrome number");
else
System.out.println(n+" is not a Palindrome number");
}
}