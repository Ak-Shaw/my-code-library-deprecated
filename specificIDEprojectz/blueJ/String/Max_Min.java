/*
 * Accept a number and print the greatest and the smallest digit present
 * in the number
 * 
 * Sample Input   ---> 8354
 * 
 * Sample Output  --->
 *                    Minimum = 3
 *                    Maximum = 8
 */
import java.io.*;
public class Max_Min
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,p,r;
String str="";
System.out.print("Enter a number :");
n=Integer.parseInt(br.readLine());
for(i=0;i<=9;i++)
{
p=n;
while(p!=0)
{
r=p%10;
if(r==i)
{
// System.out.print(r);
str=str+r;
}//End of if()
p=p/10;
}//End while()
}//End for()
//System.out.println(str);
System.out.println("Minimum Digit = "+str.charAt(0));
System.out.println("Maximum Digit = "+str.charAt(str.length()-1));
}
}