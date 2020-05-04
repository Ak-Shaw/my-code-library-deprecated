/**
n=5;

        * * * * * * * * * *
      *   *                 *
    *       *                 *
  *           *                 *
*               * * * * * * * * * *
*               *                 *
*               *                 *
*               *                 *
* * * * * * * * * * * * * * * * * *
 */
/**
n=6;

          * * * * * * * * * * * *
        *   *                     *
      *       *                     *
    *           *                     *
  *               *                     *
*                   * * * * * * * * * * * *
*                   *                     *
*                   *                     *
*                   *                     *
*                   *                     *
* * * * * * * * * * * * * * * * * * * * * *
 */
public class Pattern_40
{
public static void main(int n)
{
int s1=2*n-2,s2=0,s3=4*n-4,i,j;
for(i=0;i<2*n-1;i++)
{
for(j=0;j<s1;j++)
System.out.print(" ");
if(i>0)
System.out.print("* ");
if(i==2*n-2)
{
for(j=0;j<2*n-3;j++)
System.out.print("* ");
}
else
{
for(j=0;j<s2;j++)
System.out.print(" ");
}
System.out.print("* ");
if(i==0||i==n-1||i==s3/2)
{
for(j=0;j<s3/2;j++)
System.out.print("* ");
}
else
{
for(j=0;j<s3;j++)
System.out.print(" ");
}
System.out.println("* ");
if(i==0)
s2+=2;
if(i>0&&i<n-1)
s2+=4;
s1-=2;
}
}
}