/**
 * 
 * ORDER
 *  RDE
 *   D
 */
/**
 * 
 * COMPUTER
 *  OMPUTE
 *   MPUT
 *    PU
 */
import java.io.*;
public class Pattern_37
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a string to be arranged in order :");
String s=br.readLine();
int g=0,n=s.length();
int x=0,y=n;
if(n%2==0)
g=n/2;
else
g=n-n/2;
for(int i=0;i<g;i++)
{
for(int k=0;k<i;k++)
System.out.print(" ");
System.out.print(s.substring(x,y));
x++;
y--;
System.out.println();
}
}
}