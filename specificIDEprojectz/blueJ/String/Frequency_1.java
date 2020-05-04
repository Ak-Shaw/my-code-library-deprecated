/* WAP to input a string in upper case and print the frequency
 * of each character.
 * Example:
 * INPUT: COMPUTER HARDWARE
 * OUTPUT:
 * CHARACTERS   FREQUENCY
 * A            2
 * C            1
 * D            1
 * E            2
 * H            1
 * M            1
 * O            1
 * P            1
 * R            3
 * T            1
 * U            1
 * W            1
 *                                                [ICSE 2010]
 */
import java.io.*;
public class Frequency_1
{
public static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int n=0,f=0;
char c,ch=' ';
System.out.println("Enter a String in Upper Case :");
String a=br.readLine();
int l=a.length();
for(int i=0;i<l;i++)
{
c=a.charAt(i);
int b=(int)c;
if(b>=97&&b<=122)
{
f=1;
break;
}
}
if(f==1)
System.out.println("The entered String contains alphabets in Lower Case!");
else
{
System.out.println("CHARACTERS \t FREQUENCY \t");
for(int i=65;i<=90;i++)
{
ch=(char)i;
for(int j=0;j<l;j++)
{
c=a.charAt(j);
if(c==ch)
n=n+1;
}
if(n>0)
{
System.out.println(ch+"\t\t "+n);
n=0;
}
}
}
}
}