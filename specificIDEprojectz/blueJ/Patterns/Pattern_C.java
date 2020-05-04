/**
 * n=5;
 * 
 *     * * * * *
 *   *          *
 *  *
 * *
 * *
 * *
 * *
 *  *
 *   *          *
 *     * * * * *
 *     
 */
/**
 * n=6;
 * 
 *      * * * * * *
 *    *            *
 *   *
 *  *
 * *
 * *
 * *
 * *
 *  *
 *   *
 *    *            *
 *      * * * * * *
 */
/**
 * n=7;
 * 
 *       * * * * * * *
 *     *              *
 *    *
 *   *
 *  *
 * *
 * *
 * *
 * *
 *  *
 *   *
 *    *
 *     *              *
 *       * * * * * * *
 */
public class Pattern_C
{
public static void main(int n)
{
int i,j,x,y,z,s=0;
x=2*n;
y=n-1;
z=n-2;
for(i=1;i<=2*n;i++)
{
if(i==1||i==2*n)
s=y;
else
s=z;
for(j=1;j<=s;j++)
System.out.print(" ");
System.out.print ("*");
if(i==1||i==2*n)
{
for(j=1;j<=n-1;j++)
System.out.print(" *");
}
if(i==2||i==2*n-1)
{
for(j=1;j<=x;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println();
if(i<n)
z--;
if(i>n)
z++;
}
}
}
