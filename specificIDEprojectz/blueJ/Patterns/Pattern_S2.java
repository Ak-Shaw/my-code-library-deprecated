/**
 * n=3;
 *                 *   *   *
 *         * * * *  *     *
 *        *       *  * * *
 *       *         *
 *                *    * * *
 *               *    *     *
 *              *  * *      *
 *             * *       * *
 *                *
 *     * *         *
 *       *          *
 *        *         *
 *         * * * * *  
 * 
 * 
 * 
 */
/**
 * n=3;
 * -----------------------------------
 *                 *   *   *
 *         * * * *  *     *
 *        *       *  * * *
 *       *         *
 *------------------------------------                
 *                *    * * *
 *               *    *     *
 *              *  * *      *
 *             * *       * *
 *------------------------------------
 *                *
 *     * *         *
 *       *          *
 *        *         *
 *         * * * * *  
 *------------------------------------
 * 
 * 
 */
/**
 * n=3;
 * -----------------------------------
 * _______x________* _y* _y*
 * ____z___* * * *  * _a__*
 *        * ___b__*  * * *
 *       *         *
 *------------------------------------                
 * _______c_______*    * * *
 *               *    * __f_*
 *              *  * *      *
 *             * * __g___* *
 *------------------------------------
 * _______h_______*
 * __i_* * ___j____*
 * ___l__*          *
 *        *         *
 *         * * * * *  
 *------------------------------------
 * 
 * 
 */

/**
 * n=4;
 *                    *    *    *
 *          * * * * *  *       *
 *         *         *  *     *
 *        *           *  * * *
 *       *             *
 *                    *    * * *
 *                   *    *     *
 *                  *    *       *
 *                 *  * *        *
 *                * *       * * *
 *                   *
 *      * *           *
 *        *            *
 *         *            *
 *          *           *
 *           * * * * * *  
 * 
 * 
 * 
 */
/**
 * n=4;
 *------------------------------------
 *                    *    *    *
 *          * * * * *  *       *
 *         *         *  *     *
 *        *           *  * * *
 *       *             *
 *------------------------------------
 *                    *    * * *
 *                   *    *     *
 *                  *    *       *
 *                 *  * *        *
 *                * *       * * *
 *------------------------------------
 *                   *
 *      * *           *
 *        *            *
 *         *            *
 *          *           *
 *           * * * * * *  
 *------------------------------------
 * 
 * 
 * 
 */
/**
 * n=4;
 *------------------------------------
 * _______x___________* _y_* _y_*
 * ____z____* * * * *  * _a____*
 *         * ___b____*  *     *
 *        *           *  * * *
 *       *             *
 *------------------------------------
 * _______c___________*    * * *
 *                   *    * __f_*
 *                  *    *       *
 *                 *  * *        *
 *                * * ___g__* * *
 *------------------------------------
 * ________h_________*
 * __i__* * ___j______*
 * ____l__*            *
 *         *            *
 *          *           *
 *           * * * * * *  
 *------------------------------------
 * 
 * 
 * 
 */
public class Pattern_S2
{
public static void main(int n)
{
int a,b,c,f,g,h,i,j,l,x,y,z,m,p;
int q,w=(int)Math.pow(2,30);
x=3*n+7;
y=n-1;
z=n+5;
a=2*n-2;
b=2*n;
c=4*n+3;
f=4;g=6;
h=3*n+6;
i=n+1;
j=2*n+2;
l=n+3;
for(m=1;m<=n+1;m++)
{
if(m==1)
{
for(p=1;p<=x;p++)
System.out.print(" ");
System.out.print("* ");
for(q=1;q<=w;q++);
for(p=1;p<=y;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("* ");
for(q=1;q<=w;q++);
for(p=1;p<=y;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
}
else
{
for(p=1;p<=z;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("* ");
for(q=1;q<=w;q++);
if(m==2)
{
for(p=1;p<=n-1;p++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
else
{
for(p=1;p<=b;p++)
System.out.print(" ");
}
System.out.print("*  ");
for(q=1;q<=w;q++);
if(m>=2&&m<n)
{
System.out.print("* ");
for(q=1;q<=w;q++);
for(p=1;p<=a;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
}
if(m==n)
System.out.print("* * *");
for(q=1;q<=w;q++);
if(m>=2)
{
a-=2;
z--;
}
if(m>=3)
b+=2;
}
for(q=1;q<=w;q++);
System.out.println();
}
for(m=1;m<=n+1;m++)
{
for(p=1;p<=c;p++)
System.out.print(" ");
if(m<n)
{
System.out.print("*    * ");
for(q=1;q<=w;q++);
}
else if(m==n)
{
System.out.print("*  * * ");
for(q=1;q<=w;q++);
}
else
{
System.out.print("* * ");
for(q=1;q<=w;q++);
for(p=1;p<=g;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
for(p=1;p<n;p++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
if(m==1)
System.out.print("* *");
for(q=1;q<=w;q++);
if(m>=2&&m<=n)
{
if(m==2)
f=4;
for(p=1;p<=f;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
}
System.out.println();
c--;
if(m>=2&&m<n-1)
f+=2;
else
f++;
}
for(m=1;m<=n+2;m++)
{
if(m==1)
{
for(p=1;p<=h;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
}
if(m==2)
{
for(p=1;p<=i;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("* ");
for(q=1;q<=w;q++);
}
if(m>2)
{
for(p=1;p<=l;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
}
if(m==3)
j+=1;
if(m>n)
j-=1;
if(m>1)
{
System.out.print("* ");
for(q=1;q<=w;q++);
if(m!=n+2)
{
for(p=1;p<=j;p++)
System.out.print(" ");
for(q=1;q<=w;q++);
}
else
{
for(p=1;p<=n;p++)
System.out.print("* ");
for(q=1;q<=w;q++);
}
}
System.out.print("*\n");
for(q=1;q<=w;q++);
if(m>2)
l++;
}
}
}