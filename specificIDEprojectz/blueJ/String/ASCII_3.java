/*WAP to accept a String and display the ASCII value of each Character 
  and also display the sum of the ASCII values of the Characters.
Sample Input  ---> Computer
Sample Output ---> ASCII Value of Character C : 67
                   ASCII Value of Character o : 111
                   ASCII Value of Character m : 109
                   ASCII Value of Character p : 112
                   ASCII Value of Character u : 117
                   ASCII Value of Character t : 116
                   ASCII Value of Character e : 101
                   ASCII Value of Character r : 114
                   Total ASCII Value of the given String Computer : 847
*/
import java.io.*;
public class ASCII_3
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
int len,i,n,s=0;
char ch;
System.out.print("Enter a String :");
str=br.readLine();
len=str.length();
for(i=0;i<len;i++)
{
ch=str.charAt(i);
n=(int)ch;
System.out.println("ASCII Value of Character '"+ch+"' : "+n);
s=s+n;
}
System.out.println("Total ASCII Value of given String '"+str+"' : "+s);
}
}