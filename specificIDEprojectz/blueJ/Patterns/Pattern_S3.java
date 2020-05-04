/**
n=5;

    * * * * * 
  * *     * * 
* * * * *   * 
*   *   *   * 
*   * * * * * 
* *     * * 
* * * * * 

n=7;

      * * * * * * * 
    * *         * * 
  *   *       *   * 
* * * * * * *     * 
*     *     *     * 
*     *     *     * 
*     * * * * * * * 
*   *       *   * 
* *         * * 
* * * * * * * 

n=6;

    * * * * * * 
  * *       * * 
* * * * * *   * 
*   *     *   * 
*   *     *   * 
*   * * * * * * 
* *       * * 
* * * * * * 

n=8;

      * * * * * * * * 
    * *           * * 
  *   *         *   * 
* * * * * * * *     * 
*     *       *     * 
*     *       *     * 
*     *       *     * 
*     * * * * * * * * 
*   *         *   * 
* *           * * 
* * * * * * * * 

 */
public class Pattern_S3
{
public static void main(int n)
{
int q,w=(int)Math.pow(2,28);
int s1,s2,s3,s4,s5,i,j,k,l,m,p;
s3=0;
s5=n-2;
if(n%2==0)
{
s1=n-2;
l=n/2-2;
s2=n+2*(l-1);
s4=n-4;
m=n/2-1;
p=l+1;
}
else
{
s1=n-1;
l=(n+1)/2-2;
s2=n-1+2*(l-1);
s4=n-3;
m=n/2;
p=l;
}
for(i=0;i<m;i++)
{
for(j=0;j<s1;j++)
System.out.print(" ");
System.out.print("* ");
for(q=1;q<=w;q++);
for(j=0;j<s3;j++)
System.out.print(" ");
System.out.print("* ");
for(q=1;q<=w;q++);
if(i==0)
{
for(j=0;j<n-3;j++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
else
{
for(j=0;j<s2;j++)
System.out.print(" ");
System.out.print("* ");
for(q=1;q<=w;q++);
s2-=2;
}
for(q=1;q<=w;q++);
for(j=0;j<s3;j++)
System.out.print(" ");
System.out.println("* ");
for(q=1;q<=w;q++);
s1-=2;
if(i>0)
s3+=2;
}
if(n%2==0)
k=s5;
else
k=s4;
for(i=0;i<n/2+1;i++)
{
System.out.print("* ");
for(q=1;q<=w;q++);
if(i==0)
{
for(j=0;j<l;j++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
else
{
for(j=0;j<s4;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
}
for(q=1;q<=w;q++);
System.out.print("* ");
for(q=1;q<=w;q++);
if(i==0||i==n/2)
{
for(j=0;j<p;j++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
else
{
for(j=0;j<k;j++)
System.out.print(" ");
}
for(q=1;q<=w;q++);
System.out.print("* ");
if(i!=n/2)
{
for(j=0;j<s4;j++)
System.out.print(" ");
}
else
{
for(j=0;j<l;j++)
System.out.print("* ");
}
for(q=1;q<=w;q++);
System.out.println("* ");
}
s3-=2;
s2+=2;
for(i=0;i<m;i++)
{
System.out.print("* ");
for(j=0;j<s3;j++)
System.out.print(" ");
System.out.print("* ");
if(i<=l-1)
{
for(j=0;j<s2;j++)
System.out.print(" ");
s2+=2;
}
else
{
for(j=0;j<n-4;j++)
System.out.print("* ");
}
for(q=1;q<=w;q++);
System.out.print("* ");
for(j=0;j<s3;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.println("* ");
for(q=1;q<=w;q++);
s3-=2;
}
}
}