/* Accept a number and check whether it is a prime 
 * number or not
 */
public class Prime
{
public static void main(int n)
{
int i;
for(i=2;i<n;i++)
{
if(n%i==0)
{
break;
}
}
if(i==n)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}