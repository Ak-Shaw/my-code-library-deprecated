/* Accept a limit and display all the perfect numbers upto 
 * that limit
 */
public class Perfect_2
{
public static void main(int lim)
{
int i,j,s=0;
for(i=1;i<=lim;i++)
{
for(j=1;j<i;j++)
{
if(i%j==0)
s=s+j;
}
if(s==i)
System.out.println(s+" is a perfect number");
s=0;
}
}
}