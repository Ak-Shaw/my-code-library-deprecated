/** Accept a number and check whether it is an Armstrong 
 *  number or not.
 *     A number is said to be an Armstrong number when the 
 *  sum of the cube value of each digit is same as the 
 *  original
 *    Such as,
 *        153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 = 153
 *        371 -> 3^3 + 7^3 + 1^3 -> 24 + 343 + 1 = 371
 *        407 -> 4^3 + 0^3 + 7^3 -> 64 + 0 + 343 = 407
 */
public class Armstrong
{
public static void main(int n)
{
int a,d=0,s=0;
a=n;
while(a!=0)
{
d=a%10;
s=s+d*d*d;
a=a/10;
}
if(s==n)
System.out.println(n+" is an Armstrong number");
else
System.out.println(n+" is not an Armstrong number");
}
}