/* Accept a number and check whether it is a prime 
 * number or not
 */
public class Prime1
{
public static void main(int n)
{
int i,t=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
t++;
}
if(t==2)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}