/* Accept a number and check whether it is a Smith number or
 * not.
 *   A number is said to be a Smith number when the sum of the
 * digits of the prime factors is equal to the sum of the digits 
 * of the number.
 * For Example -> 2 and 11 are the prime factors of 22 and 
 * 2 + 1 + 1 = 4 also 2 + 2 = 4, hence 22 is a Smith number
 */
public class Smith
{
public static void main(int n)
{
int sum=0;
int num=n;
while(n>0)
{
int r=n%10;
sum=sum+r;
n=n/10;
}
int s=0;
for(int i=2;i<num;i++)
{
int f=0;
if(num%i==0)
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
int j=i;
while(j>0)
{
int r=j%10;
s=s+r;
j=j/10;
}
}
}
}
if(s==sum)
System.out.println(num+" is a Smith number");
else
System.out.println(num+" is not a Smith number");
}
}