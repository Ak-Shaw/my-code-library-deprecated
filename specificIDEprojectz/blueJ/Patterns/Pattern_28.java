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
public class Pattern_28
{
public static void main(int n)
{
int a,i,j,b,c,d,g;
a=4*n-4;
for(i=1;i<=n-1;i++)
{
for(j=1;j<=a;j++)
System.out.print(" ");
System.out.println("*");
a-=2;
}
for(i=1;i<=2*n-2;i++)
System.out.print(" ");
System.out.print("*");
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
System.out.print("*");
System.out.println();
c=2*n;
b=4*n-9;
d=3;
for(i=1;i<=n-2;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
c+=2;
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
b-=4;
System.out.print("*");
for(j=1;j<=d;j++)
System.out.print(" ");
d+=4;
System.out.println("*");
}
System.out.print("*");
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
System.out.print("*");
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
System.out.print("*");
System.out.println();
c=2;
b=4*n-9;
d=3;
for(i=1;i<=n-2;i++)
{
for(j=1;j<=c;j++)
System.out.print(" ");
c+=2;
System.out.print("*");
for(j=1;j<=b;j++)
System.out.print(" ");
b-=4;
System.out.print("*");
for(j=1;j<=d;j++)
System.out.print(" ");
d+=4;
System.out.println("*");
}
for(i=1;i<=2*n-2;i++)
System.out.print(" ");
System.out.print("*");
for(i=1;i<=4*(n+1)-9;i++)
System.out.print(" ");
System.out.println("*");
g=6*n-8;
for(i=1;i<=n-1;i++)
{
for(j=1;j<=g;j++)
System.out.print(" ");
g-=2;
System.out.println("*");
}
}
}