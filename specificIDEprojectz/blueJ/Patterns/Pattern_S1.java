/**
 * n=5;
 * 
 *                 *
 *               *
 *             *
 *           *
 *         *               *
 *           *           *   *
 *             *       *       *
 *               *   *           *
 * *               *               *
 *   *           *   *
 *     *       *       *
 *       *   *           *
 *         *               *
 *                       *
 *                     *
 *                   *
 *                 *
 */
/**
 * n=6;
 * 
                  *
                *
              *
            *
          *                   *
            *               *   *
              *           *       *
                *       *           *
                  *   *               *
*                   *                   *
  *               *   *
    *           *       *
      *       *           *
        *   *               *     
          *                   *
                            *
                          *
                        *
                      *
                    *

 */
/**
 * n=7;
 *   
                      *
                    *
                  *
                *
              *
            *                       *
              *                   *   *
                *               *       *
                  *           *           *
                    *       *               *
                      *   *                   *
*                       *                       *
  *                   *   *
    *               *       *
      *           *           *
        *       *               *
          *   *                   *
            *                       *
                                  *
                                *
                              *
                            *
                          *
                        *

 */
public class Pattern_S1
{
public static void main(int n)
{
int q,w=(int)Math.pow(2,30);
int a,i,j,b,c,d,g;
a=4*n-4;
for(i=1;i<=n-1;i++)
{
for(j=1;j<=a;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.println("*");
for(q=1;q<=w;q++);
a-=2;
}
for(i=1;i<=2*n-2;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
System.out.println();
c=2*n;
b=4*n-9;
d=3;
for(i=1;i<=n-2;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
c+=2;
System.out.print("*");
for(q=1;q<=w;q++);
for(j=1;j<=b;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
b-=4;
System.out.print("*");
for(q=1;q<=w;q++);
for(j=1;j<=d;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
d+=4;
System.out.println("*");
for(q=1;q<=w;q++);
}
System.out.print("*");
for(q=1;q<=w;q++);
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
System.out.println();
c=2;
b=4*n-9;
d=3;
for(i=1;i<=n-2;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
c+=2;
System.out.print("*");
for(q=1;q<=w;q++);
for(j=1;j<=b;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
b-=4;
System.out.print("*");
for(q=1;q<=w;q++);
for(j=1;j<=d;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
d+=4;
System.out.println("*");
for(q=1;q<=w;q++);
}
for(i=1;i<=2*n-2;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.print("*");
for(q=1;q<=w;q++);
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
for(q=1;q<=w;q++);
System.out.println("*");
for(q=1;q<=w;q++);
g=6*n-8;
for(i=1;i<=n-1;i++)
{
for(j=1;j<=g;j++)
System.out.print(" ");
for(q=1;q<=w;q++);
g-=2;
System.out.println("*");
for(q=1;q<=w;q++);
}
}
}