/*
 * A Triangle number is a positive integer which is formed due to the addition
 * of consecutive numbers. For example,
 *                                      3  = 1 + 2
 *                                      6  = 1 + 2 + 3
 *                                      10 = 1 + 2 + 3 + 4 
 */
import java.util.*;
public class Triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Number :");
int n=sc.nextInt();
int i,j,s=0,k=0;
for(i=1;i<n;i++)
{
s+=i;
if(s==n)
{
k=1;
break;
}
}
if(k==1)
{
System.out.print("Triangle number\n"+n+" = 1");
for(j=2;j<=i;j++)
System.out.print(" + "+j);
}
else
System.out.println("Not a Triangle number");
}
}
