/* Accept a number and check whether it is a Sphenic number
 * or not.
 *   A number which has exactly 3 prime factors and the product 
 * of the 3 factors is equal to the number itself is known as a
 * Sphenic number.
 *      Such as, 110 (It has 3 prime factors 2, 5, 11)
 *              and 2*5*11 = 110, hence it is a Sphenic number
 */
public class Sphenic
{
public static void main(int n)
{
int p=1,smt=0;
for(int i=2;i<n;i++)
{
int f=0;
if(n%i==0)
{
for(int k=2;k<i;k++)
{
if(i%k==0)
{
f=1;
break;
}
}
if(f==0)
{
smt++;
p=p*i;
}
}
}
if(smt==3&&p==n)
System.out.println(n+" is a Sphenic number");
else
System.out.println(n+" is not a Sphenic number");
}
}