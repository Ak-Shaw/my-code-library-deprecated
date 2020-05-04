/*
 * a positive natural number can be represented as
 * 
 * 27
 * 
 * 2+3+4+5+6+7
 * 8+9+10
 * 13+14
 * 
 * 9
 * 
 * 2+3+4
 * 4+5
 * 
 * 15
 * 
 * 1+2+3+4+5
 * 4+5+6
 * 7+8
 * 
 */
import java.util.*;
public class pos_nat
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("number :");
int n=sc.nextInt();
int i=1,j,k,q=0;
System.out.println("representations :");
while(i<n)
{
j=k=i;
k++;
while(j<n)
{
j+=k;
k++;
}
if(j==n)
{
System.out.print(i);
for(j=i+1;j<k;j++)
{
System.out.print("+"+j);
}
System.out.println();
q++;
}
i++;
}
if(q==0)
System.out.println("unavailable");
}
}