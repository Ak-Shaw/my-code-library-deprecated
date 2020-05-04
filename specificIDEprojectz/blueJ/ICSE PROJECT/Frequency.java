/* WAP to input a string and print the frequency of each character.
Example:
INPUT: COMPUTER in WorLd
OUTPUT:
CHARACTERS 	 FREQUENCY 	
   ' '		     2
    C		     1
    E		     1
    L		     1
    M		     1
    O		     1
    P		     1
    R		     1
    T		     1
    U		     1
    W		     1
    d		     1
    i		     1
    n		     1
    o		     1
    r		     1
*/
import java.io.*;
public class Frequency
{
public static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int n=0,f=0;
char c,ch=' ';
System.out.println("Enter a String :");
String a=br.readLine();
int l=a.length();
System.out.println("CHARACTERS \t FREQUENCY \t");
for(int i=0;i<=255;i++)
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
if(ch==' ')
System.out.println("   '"+ch+"'\t\t     "+n);
else
System.out.println("    "+ch+"\t\t     "+n);
n=0;
}
}
}
}