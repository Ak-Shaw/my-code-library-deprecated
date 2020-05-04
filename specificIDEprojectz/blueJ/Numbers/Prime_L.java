/* Accept a limit and display all the prime numbers upto that
 * limit
 */
public class Prime_L
{
public static void main(int lim)
{
int i,j;
for(i=2;i<=lim;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.println(i+" is a Prime number");
}
}
}