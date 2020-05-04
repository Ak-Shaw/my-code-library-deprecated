/**
 *   T
 *  ATN
 * PATNA
 *  ATN
 *   T
 */
import java.util.*;
public class Pattern_43
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word for pattern containing odd number of alphabets :");
String s=sc.nextLine();
System.out.println();
int i,j,l=s.length(),p=l/2;
for(i=0;i<l;i++)
{
for(j=0;j<p;j++)
System.out.print(" ");
System.out.println(s.substring(p,l-p));
if(i>=l/2)
p++;
else
p--;
}
}
}