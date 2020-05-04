/* Accept a number and check whether it is a Krishnamurti 
 * number or not
 *        A number is said to be a Krishnamurti number or
 * Peterson number or Special number if the sum of the factorial
 * values of each digit is same as the original number
 * 
 * Such as, 145 -> 1! + 4! + 5! -> 1 + 4*3*2*1 + 5*4*3*2*1 
 *                              -> 1 + 24 + 120 = 145
 */
//                                               [ICSE 2011]
public class Special
{
public static void main(int n)
{
int m,p,d,f,i,s=0;
m=n;
while(m!=0)
{
f=1;
d=m%10;
for(i=1;i<=d;i++)
f=f*i;
s=s+f;
m=m/10;
}
if(s==n)
System.out.println(n+" is a Special Number");
else
System.out.println(n+" is not a Special Number");
}
}