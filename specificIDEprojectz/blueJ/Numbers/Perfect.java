/*
A number is called Perfect if it is equal to the sum of its factors 
other than the number itself
Example : 6 = 1 + 2 + 3
                                                    [ICSE 2008]
*/
public class Perfect
{
public static void main(int n)
{
int i,s=0;
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
if(s==n)
System.out.println(n+" is a perfect number");
else
System.out.println(n+" is not a perfect number");
}
}
