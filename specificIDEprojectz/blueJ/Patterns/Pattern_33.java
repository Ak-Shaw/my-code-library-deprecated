/**
  If n=9, then output :-
  
      *
     * *
    *   *
   *     *
  *       *
   *     *
    *   *
     * *
      *
      
 */
import java.util.*;
public class Pattern_33
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the odd n-th term :");
int n=sc.nextInt();
int p2=n/2;
int p1=n-p2;
int i,k,k1,j,t;
for(i=1;i<=n;i++)
System.out.print(" ");
System.out.println("*");
p1--;
k=n-2;
k1=1;
for(i=1;i<=p1;i++)
{
for(j=1;j<=k;j++)
System.out.print(" ");
k-=1;
System.out.print("* ");
for(t=1;t<=k1;t++)
System.out.print(" ");
k1+=2;
System.out.println("*");
}
k+=2;
k1-=4;
for(i=1;i<p2;i++)
{
for(j=1;j<=k;j++)
System.out.print(" ");
k+=1;
System.out.print("*");
for(t=1;t<=k1;t++)
System.out.print(" ");
k1-=2;
System.out.println("*");
}
for(i=1;i<n;i++)
System.out.print(" ");
System.out.println("*");
}
}
