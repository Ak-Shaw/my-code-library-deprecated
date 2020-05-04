/** Enter the line no.: 5
 * 
 * *       *
 * **     **
 * ***   ***
 * **** ****
 * *********
 * **** ****
 * ***   ***
 * **     **
 * *       *
 */
import java.util.*;
public class Pattern_30
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,num;
System.out.print("Enter the line number from 1to 9 :");
num=sc.nextInt();
for(i=0;i<num;i++)
{
for(j=0;j<=i;j++)
//System.out.print((j+1));
System.out.print("*");
for(j=0;j<2*(num-1-i)-1;j++)
System.out.print(" ");
for(j=i+1;j>=1;j--)
{
if(j!=num)
//System.out.print(j);
System.out.print("*");
}
System.out.println();
}
for(i=num-1;i>=1;i--)
{
for(j=0;j<i;j++)
//System.out.print((j+1));
System.out.print("*");
for(j=0;j<2*(num-i)-1;j++)
System.out.print(" ");
for(j=i;j>=1;j--)
//System.out.print(j);
System.out.print("*");
System.out.println();
}
}
}