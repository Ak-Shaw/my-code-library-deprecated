/* WAP to accept a word and display the new word after removing all 
 * the repeated alphabets.
 * 
 * Sample Input  ---> applications
 * Sample Output ---> aplictons
 * 
 *              [Array Method]
 */
import java.io.*;
public class Repeat_Alpha
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a word :");
String w=br.readLine();
int i,j,l=w.length();
char c;
//char a[]=w.toCharArray();
char a[]=new char[l];
String s="";
for(i=0;i<l;i++)
{
c=w.charAt(i);
a[i]=c;
}
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(a[i]==a[j])
a[j]=' ';
}
}
for(i=0;i<l;i++)
{
if(a[i]!=' ')
s+=a[i];
}
System.out.println("Word deprived of repeated alphabets : "+s);
}
}