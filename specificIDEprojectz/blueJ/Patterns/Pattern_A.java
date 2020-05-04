/**
 * n=5;
 * 
 *        *
 *       * *
 *      *   *
 *     *     *
 *    *********
 *   *         *
 *  *           *
 * *             *
 */
/**
 * n=6;
 * 
 *          *
 *         * *
 *        *   *
 *       *     *
 *      *       *
 *     ***********
 *    *           *
 *   *             *
 *  *               *
 * *                 *
 */
/**
 * n=7;
 *            *
 *           * *
 *          *   *
 *         *     *
 *        *       *
 *       *         *
 *      *************
 *     *             *
 *    *               *
 *   *                 *
 *  *                   *
 * *                     *
 */
public class Pattern_A
{
public static void main(int n)
{
int i,j,k,x,y,z;
x=2*n-3;
y=x+1;
z=y;
k=-1;
for(i=1;i<=z;i++)
{
for(j=1;j<=x;j++)
System.out.print(" ");
System.out.print("*");
if(i==n)
{
for(j=1;j<=y;j++)
System.out.print("*");
}
else
{
for(j=1;j<=k;j++)
System.out.print(" ");
if(i>1)
System.out.print("*");
}
k+=2;
x-=1;
System.out.println();
}
}
}


